package LowLevelDesign.ParkingLot.gates;

import LowLevelDesign.ParkingLot.parking.ParkingSpot;
import LowLevelDesign.ParkingLot.parking.ParkingTicket;
import LowLevelDesign.ParkingLot.vehicles.Vehicle;

public class EntryGate extends Gate {
    public EntryGate(String gateId) {
        super(gateId, GateType.ENTRY);
    }

    public ParkingTicket generateTicket(Vehicle vehicle, ParkingSpot spot) {
        return new ParkingTicket(vehicle, spot);
    }
}
