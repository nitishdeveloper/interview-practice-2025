package LowLevelDesign.ParkingLot.pricing;

import LowLevelDesign.ParkingLot.parking.ParkingTicket;
import LowLevelDesign.ParkingLot.vehicles.VehicleType;

import java.util.EnumMap;
import java.util.Map;

public class HourlyPricing implements PricingStrategy {
    private final Map<VehicleType, Double> hourlyRates;

    public HourlyPricing() {
        this.hourlyRates = new EnumMap<>(VehicleType.class);
        hourlyRates.put(VehicleType.MOTORCYCLE, 0.5);
        hourlyRates.put(VehicleType.CAR, 2.0);
        hourlyRates.put(VehicleType.BUS, 5.0);
    }

    @Override
    public double calculateFee(ParkingTicket ticket) {
        long durationMillis = ticket.getExitTime().getTime() - ticket.getEntryTime().getTime();
        double hours = durationMillis / (1000.0 * 60 * 60);
        return Math.ceil(hours) * hourlyRates.get(ticket.getVehicle().getType());
    }
}