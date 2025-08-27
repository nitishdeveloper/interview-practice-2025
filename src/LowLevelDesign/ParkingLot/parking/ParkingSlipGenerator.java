package LowLevelDesign.ParkingLot.parking;

import java.util.Date;

public class ParkingSlipGenerator {
    public void generateSlip(String ticketNumber, String licensePlate,
                             Date entryTime, Date exitTime,
                             double amountPaid, String transactionId) {
        System.out.println("\n=== PARKING SLIP ===");
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Entry Time: " + entryTime);
        System.out.println("Exit Time: " + exitTime);
        System.out.println("Amount Paid: $" + amountPaid);
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Thank you for parking with us!");
        System.out.println("=====================\n");
    }
}