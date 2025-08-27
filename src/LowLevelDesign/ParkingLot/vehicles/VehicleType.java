package LowLevelDesign.ParkingLot.vehicles;

import LowLevelDesign.ParkingLot.parking.SpotType;

public enum VehicleType {
    MOTORCYCLE(SpotType.SMALL),
    CAR(SpotType.MEDIUM),
    BUS(SpotType.LARGE);

    private final SpotType requiredSpotType;

    VehicleType(SpotType requiredSpotType) {
        this.requiredSpotType = requiredSpotType;
    }

    public SpotType getRequiredSpotType() {
        return requiredSpotType;
    }
}