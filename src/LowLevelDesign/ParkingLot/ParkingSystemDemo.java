package LowLevelDesign.ParkingLot;


import LowLevelDesign.ParkingLot.dashboard.Dashboard;
import LowLevelDesign.ParkingLot.gates.EntryGate;
import LowLevelDesign.ParkingLot.gates.ExitGate;
import LowLevelDesign.ParkingLot.parking.ParkingFloor;
import LowLevelDesign.ParkingLot.parking.ParkingLot;
import LowLevelDesign.ParkingLot.parking.ParkingTicket;
import LowLevelDesign.ParkingLot.payment.PaymentMethodType;
import LowLevelDesign.ParkingLot.payment.PaymentProcessor;
import LowLevelDesign.ParkingLot.payment.PaymentReceipt;
import LowLevelDesign.ParkingLot.pricing.HourlyPricing;
import LowLevelDesign.ParkingLot.vehicles.Car;
import LowLevelDesign.ParkingLot.vehicles.Motorcycle;
import LowLevelDesign.ParkingLot.vehicles.Vehicle;

public class ParkingSystemDemo {
    public static void main(String[] args) {
        // Initialize parking lot
        ParkingLot parkingLot = ParkingLot.getInstance();

        // Add dashboard as observer
        parkingLot.addObserver(new Dashboard());

        // Setup infrastructure
        parkingLot.addFloor(new ParkingFloor(1, 10, 20, 5)); // 10 motorcycle, 20 car, 5 bus spots
        parkingLot.addGate(new EntryGate("ENTRY-1"));
        parkingLot.addGate(new ExitGate("EXIT-1", new PaymentProcessor(parkingLot.getPaymentRegistry())));

        // Set pricing strategy
        parkingLot.setPricingStrategy(new HourlyPricing());

        // Park vehicles
        Vehicle car1 = new Car("ABC-1234");
        Vehicle motorcycle1 = new Motorcycle("MOTO-001");

        ParkingTicket carTicket = parkingLot.parkVehicle(car1, "ENTRY-1");
        ParkingTicket motorTicket = parkingLot.parkVehicle(motorcycle1, "ENTRY-1");

        // Simulate time passing (2 hours)
        try {
            System.out.println("\nSimulating 2 hours parking time...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Exit vehicles
        try {
            System.out.println("\nProcessing payments...");

            // Car exits with credit card payment
            PaymentReceipt carPayment = parkingLot.exitVehicle(
                    carTicket.getTicketNumber(),
                    "EXIT-1",
                    PaymentMethodType.CREDIT_CARD
            );
            System.out.println("Car payment status: " + carPayment.getPaymentResult().getMessage());

            // Motorcycle exits with cash payment
            PaymentReceipt motorPayment = parkingLot.exitVehicle(
                    motorTicket.getTicketNumber(),
                    "EXIT-1",
                    PaymentMethodType.CASH
            );
            System.out.println("Motorcycle payment status: " + motorPayment.getPaymentResult().getMessage());

        } catch (Exception e) {
            System.err.println("Error processing payment: " + e.getMessage());
        }
    }
}