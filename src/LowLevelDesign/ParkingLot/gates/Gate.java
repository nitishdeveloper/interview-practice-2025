package LowLevelDesign.ParkingLot.gates;

public abstract class Gate {
    private final String gateId;
    private final GateType type;

    protected Gate(String gateId, GateType type) {
        this.gateId = gateId;
        this.type = type;
    }

    public String getGateId() {
        return gateId;
    }

    public GateType getType() {
        return type;
    }
}
