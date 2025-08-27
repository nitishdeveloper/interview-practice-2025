package LowLevelDesign.ParkingLot.parking;

import LowLevelDesign.ParkingLot.vehicles.VehicleType;
import java.util.*;

public class ParkingFloor {
    private final int floorNumber;
    private final List<ParkingSpot> spots;
    private final Map<SpotType, Integer> spotCounts;

    public ParkingFloor(int floorNumber, int motorcycleSpots, int carSpots, int busSpots) {
        this.floorNumber = floorNumber;
        this.spots = new ArrayList<>();
        this.spotCounts = new EnumMap<>(SpotType.class);

        initializeSpots(motorcycleSpots, carSpots, busSpots);
    }

    private void initializeSpots(int motorcycleSpots, int carSpots, int busSpots) {
        addSpots(motorcycleSpots, SpotType.SMALL);
        addSpots(carSpots, SpotType.MEDIUM);
        addSpots(busSpots, SpotType.LARGE);

        spotCounts.put(SpotType.SMALL, motorcycleSpots);
        spotCounts.put(SpotType.MEDIUM, carSpots);
        spotCounts.put(SpotType.LARGE, busSpots);
    }

    private void addSpots(int count, SpotType type) {
        for (int i = 0; i < count; i++) {
            spots.add(new ParkingSpot(floorNumber + "-" + type.name() + "-" + i, type));
        }
    }

    public Optional<ParkingSpot> findAvailableSpot(VehicleType vehicleType) {
        return spots.stream()
                .filter(spot -> spot.isAvailable() && spot.getType() == vehicleType.getRequiredSpotType())
                .findFirst();
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public Map<SpotType, Integer> getAvailableSpotsCount() {
        Map<SpotType, Integer> availableSpots = new EnumMap<>(SpotType.class);

        // Count available spots for each type
        availableSpots.put(SpotType.SMALL,
                (int) spots.stream()
                        .filter(s -> s.getType() == SpotType.SMALL && s.isAvailable())
                        .count());

        availableSpots.put(SpotType.MEDIUM,
                (int) spots.stream()
                        .filter(s -> s.getType() == SpotType.MEDIUM && s.isAvailable())
                        .count());

        availableSpots.put(SpotType.LARGE,
                (int) spots.stream()
                        .filter(s -> s.getType() == SpotType.LARGE && s.isAvailable())
                        .count());

        return availableSpots;
    }
}