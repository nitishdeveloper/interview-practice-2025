package LowLevelDesign.ParkingLot.parking;

import LowLevelDesign.ParkingLot.vehicles.Vehicle;

import java.util.Date;
import java.util.UUID;

public class ParkingTicket {
    private final String ticketNumber;
    private final Vehicle vehicle;
    private final ParkingSpot spot;
    private final Date entryTime;
    private Date exitTime;
    private double amount;

    public ParkingTicket(Vehicle vehicle, ParkingSpot spot) {
        this.ticketNumber = "TKT-" + UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.spot = spot;
        this.entryTime = new Date();
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}