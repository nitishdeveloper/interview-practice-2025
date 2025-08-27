package LowLevelDesign.ParkingLot.dashboard;

import LowLevelDesign.ParkingLot.parking.ParkingLot;
import LowLevelDesign.ParkingLot.parking.ParkingLotObserver;
import LowLevelDesign.ParkingLot.parking.SpotType;

import java.util.Map;

public class Dashboard implements ParkingLotObserver {
    public void update(ParkingLot parkingLot) {
        displayParkingStatus(parkingLot);
    }

    private void displayParkingStatus(ParkingLot parkingLot) {
        System.out.println("\n=== PARKING LOT DASHBOARD ===");

        // Display total available spots
        Map<SpotType, Integer> totalSpots = parkingLot.getAvailableSpotsCount();
        System.out.println("\nTOTAL AVAILABLE SPOTS:");
        System.out.printf("Motorcycle: %d, Car: %d, Bus: %d%n",
                totalSpots.getOrDefault(SpotType.SMALL, 0),
                totalSpots.getOrDefault(SpotType.MEDIUM, 0),
                totalSpots.getOrDefault(SpotType.LARGE, 0));

        // Display floor-wise availability
        System.out.println("\nFLOOR-WISE AVAILABILITY:");
        parkingLot.getFloors().forEach(floor -> {
            Map<SpotType, Integer> floorSpots = parkingLot.getAvailableSpotsCount(floor.getFloorNumber());
            System.out.printf("Floor %d - Motorcycle: %d, Car: %d, Bus: %d%n",
                    floor.getFloorNumber(),
                    floorSpots.getOrDefault(SpotType.SMALL, 0),
                    floorSpots.getOrDefault(SpotType.MEDIUM, 0),
                    floorSpots.getOrDefault(SpotType.LARGE, 0));
        });

        System.out.println("=============================");
    }
}