package LowLevelDesign.ParkingLot.pricing;

import LowLevelDesign.ParkingLot.parking.ParkingTicket;

public interface PricingStrategy {
    double calculateFee(ParkingTicket ticket);
}
