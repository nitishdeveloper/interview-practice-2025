package LowLevelDesign.ParkingLot.parking;

import LowLevelDesign.ParkingLot.gates.*;
import LowLevelDesign.ParkingLot.payment.*;
import LowLevelDesign.ParkingLot.pricing.HourlyPricing;
import LowLevelDesign.ParkingLot.pricing.PricingStrategy;
import LowLevelDesign.ParkingLot.vehicles.Vehicle;
import LowLevelDesign.ParkingLot.vehicles.VehicleType;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ParkingLot {
    private static volatile ParkingLot instance;
    private volatile PricingStrategy pricingStrategy;
    private final List<ParkingFloor> floors;
    private final Map<String, Gate> gates;
    private final Map<String, ParkingTicket> activeTickets;
    private final PaymentFactoryRegistry paymentRegistry;
    private final List<ParkingLotObserver> observers;
    private final AtomicInteger totalCapacity;
    private final AtomicInteger currentOccupancy;

    private ParkingLot() {
        this.floors = new ArrayList<>();
        this.gates = new ConcurrentHashMap<>();
        this.activeTickets = new ConcurrentHashMap<>();
        this.pricingStrategy = new HourlyPricing();
        this.paymentRegistry = initializePaymentRegistry();
        this.observers = new CopyOnWriteArrayList<>();
        this.totalCapacity = new AtomicInteger(0);
        this.currentOccupancy = new AtomicInteger(0);
    }

    public static ParkingLot getInstance() {
        if (instance == null) {
            synchronized (ParkingLot.class) {
                if (instance == null) {
                    instance = new ParkingLot();
                }
            }
        }
        return instance;
    }

    private PaymentFactoryRegistry initializePaymentRegistry() {
        PaymentFactoryRegistry registry = new PaymentFactoryRegistry();
        registry.registerFactory(PaymentMethodType.CASH, new CashPaymentFactory());
        registry.registerFactory(PaymentMethodType.CREDIT_CARD, new CardPaymentFactory());
//        registry.registerFactory(PaymentMethodType.UPI, new UPIPaymentFactory());
//        registry.registerFactory(PaymentMethodType.NET_BANKING, new NetBankingPaymentFactory());
        return registry;
    }

    public synchronized void addFloor(ParkingFloor floor) {
        if (floor == null) {
            throw new IllegalArgumentException("Floor cannot be null");
        }
        floors.add(floor);
        notifyObservers();
    }

    public synchronized void addGate(Gate gate) {
        if (gate == null) {
            throw new IllegalArgumentException("Gate cannot be null");
        }
        if (gates.containsKey(gate.getGateId())) {
            throw new IllegalStateException("Gate with ID " + gate.getGateId() + " already exists");
        }
        gates.put(gate.getGateId(), gate);
        notifyObservers();
    }

    public synchronized void setPricingStrategy(PricingStrategy pricingStrategy) {
        if (pricingStrategy == null) {
            throw new IllegalArgumentException("Pricing strategy cannot be null");
        }
        this.pricingStrategy = pricingStrategy;
        notifyObservers();
    }

    public ParkingTicket parkVehicle(Vehicle vehicle, String entryGateId) {
        validateVehicle(vehicle);
        EntryGate entryGate = getEntryGate(entryGateId);

        ParkingSpot spot = findAvailableSpot(vehicle.getType())
                .orElseThrow(() -> new IllegalStateException("No available spots for " + vehicle.getType()));

        synchronized (this) {
            if (!spot.assignVehicle(vehicle)) {
                throw new IllegalStateException("Failed to assign vehicle to spot");
            }
            currentOccupancy.incrementAndGet();
            ParkingTicket ticket = entryGate.generateTicket(vehicle, spot);
            activeTickets.put(ticket.getTicketNumber(), ticket);
            notifyObservers();
            return ticket;
        }
    }

    public PaymentReceipt exitVehicle(String ticketNumber, String exitGateId, PaymentMethodType paymentMethod) {
        validatePaymentMethod(paymentMethod);
        ExitGate exitGate = getExitGate(exitGateId);
        ParkingTicket ticket = getValidTicket(ticketNumber);

        synchronized (this) {
            ticket.setExitTime(new Date());
            ticket.setAmount(pricingStrategy.calculateFee(ticket));

            PaymentResult payment = exitGate.processPayment(ticket, paymentMethod);
            PaymentReceipt receipt = new PaymentReceipt(ticket, payment);

            if (payment.isSuccess()) {
                ticket.getSpot().removeVehicle();
                activeTickets.remove(ticketNumber);
                currentOccupancy.decrementAndGet();
                notifyObservers();
            }

            return receipt;
        }
    }

    // Helper methods
    private void validateVehicle(Vehicle vehicle) {
        if (vehicle == null) {
            throw new IllegalArgumentException("Vehicle cannot be null");
        }
    }

    private void validatePaymentMethod(PaymentMethodType paymentMethod) {
        if (paymentMethod == null) {
            throw new IllegalArgumentException("Payment method cannot be null");
        }
        if (!paymentRegistry.supports(paymentMethod)) {
            throw new UnsupportedOperationException("Payment method not supported: " + paymentMethod);
        }
    }

    private EntryGate getEntryGate(String gateId) {
        Gate gate = gates.get(gateId);
        if (!(gate instanceof EntryGate)) {
            throw new IllegalArgumentException("Gate " + gateId + " is not an entry gate");
        }
        return (EntryGate) gate;
    }

    private ExitGate getExitGate(String gateId) {
        Gate gate = gates.get(gateId);
        if (!(gate instanceof ExitGate)) {
            throw new IllegalArgumentException("Gate " + gateId + " is not an exit gate");
        }
        return (ExitGate) gate;
    }

    private Optional<ParkingSpot> findAvailableSpot(VehicleType vehicleType) {
        return floors.stream()
                .map(floor -> floor.findAvailableSpot(vehicleType)).findFirst().get();
    }

    private ParkingTicket getValidTicket(String ticketNumber) {
        ParkingTicket ticket = activeTickets.get(ticketNumber);
        if (ticket == null) {
            throw new IllegalArgumentException("Invalid ticket number: " + ticketNumber);
        }
        return ticket;
    }

    // Observer pattern
    public void addObserver(ParkingLotObserver observer) {
        observers.add(Objects.requireNonNull(observer));
    }

    public void removeObserver(ParkingLotObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        observers.forEach(observer -> {
            try {
                observer.update(this);
            } catch (Exception e) {
                System.err.println("Error notifying observer: " + e.getMessage());
            }
        });
    }

    // Getters with improved thread safety
    public List<ParkingFloor> getFloors() {
        return Collections.unmodifiableList(new ArrayList<>(floors));
    }

    public Collection<Gate> getGates() {
        return Collections.unmodifiableCollection(gates.values());
    }

    public Map<String, ParkingTicket> getActiveTickets() {
        return Collections.unmodifiableMap(new HashMap<>(activeTickets));
    }

    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }

    public PaymentFactoryRegistry getPaymentRegistry() {
        return paymentRegistry;
    }

    public int getTotalCapacity() {
        return totalCapacity.get();
    }

    public int getCurrentOccupancy() {
        return currentOccupancy.get();
    }

    public double getOccupancyPercentage() {
        return totalCapacity.get() == 0 ? 0 : (currentOccupancy.get() * 100.0) / totalCapacity.get();
    }

    public Map<SpotType, Integer> getAvailableSpotsCount() {
        return floors.stream()
                .flatMap(floor -> floor.getAvailableSpotsCount().entrySet().stream())
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey,
                        Collectors.summingInt(Map.Entry::getValue)
                ));
    }

    public Map<SpotType, Integer> getAvailableSpotsCount(int floorNumber) {
        return floors.stream()
                .filter(floor -> floor.getFloorNumber() == floorNumber)
                .findFirst()
                .map(ParkingFloor::getAvailableSpotsCount)
                .orElse(Collections.emptyMap());
    }
}