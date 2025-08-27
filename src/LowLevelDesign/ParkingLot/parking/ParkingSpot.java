package LowLevelDesign.ParkingLot.parking;

import LowLevelDesign.ParkingLot.vehicles.Vehicle;

public class ParkingSpot {
    private final String spotId;
    private final SpotType type;
    private Vehicle vehicle;
    private boolean isAvailable;

    public ParkingSpot(String spotId, SpotType type) {
        this.spotId = spotId;
        this.type = type;
        this.isAvailable = true;
    }

    public synchronized boolean assignVehicle(Vehicle vehicle) {
        if (isAvailable && vehicle.getType().getRequiredSpotType() == type) {
            this.vehicle = vehicle;
            this.isAvailable = false;
            return true;
        }
        return false;
    }

    public synchronized boolean removeVehicle() {
        if (!isAvailable) {
            this.vehicle = null;
            this.isAvailable = true;
            return true;
        }
        return false;
    }

    public String getSpotId() { return spotId; }
    public SpotType getType() { return type; }
    public Vehicle getVehicle() { return vehicle; }
    public boolean isAvailable() { return isAvailable; }
}