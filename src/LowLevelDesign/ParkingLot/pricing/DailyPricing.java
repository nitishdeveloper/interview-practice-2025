package LowLevelDesign.ParkingLot.pricing;

import LowLevelDesign.ParkingLot.parking.ParkingTicket;
import LowLevelDesign.ParkingLot.vehicles.VehicleType;

import java.util.EnumMap;
import java.util.Map;

public class DailyPricing implements PricingStrategy {
    private final Map<VehicleType, Double> dailyRates;

    public DailyPricing() {
        this.dailyRates = new EnumMap<>(VehicleType.class);
        dailyRates.put(VehicleType.MOTORCYCLE, 10.0);
        dailyRates.put(VehicleType.CAR, 25.0);
        dailyRates.put(VehicleType.BUS, 60.0);
    }

    @Override
    public double calculateFee(ParkingTicket ticket) {
        long durationMillis = ticket.getExitTime().getTime() - ticket.getEntryTime().getTime();
        double days = Math.ceil(durationMillis / (1000.0 * 60 * 60 * 24));
        return days * dailyRates.get(ticket.getVehicle().getType());
    }
}