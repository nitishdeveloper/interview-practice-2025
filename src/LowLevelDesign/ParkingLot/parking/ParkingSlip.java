package LowLevelDesign.ParkingLot.parking;

import LowLevelDesign.ParkingLot.payment.PaymentMethodType;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class ParkingSlip {
    private final String slipNumber;
    private final String ticketNumber;
    private final String licensePlate;
    private final Date entryTime;
    private final Date exitTime;
    private final double amountPaid;
    private final PaymentMethodType paymentMethod;
    private final LocalDateTime generatedAt;

    public ParkingSlip(String ticketNumber, String licensePlate, Date entryTime,
                       Date exitTime, double amountPaid, PaymentMethodType paymentMethod) {
        this.slipNumber = "SLP-" + UUID.randomUUID().toString();
        this.ticketNumber = ticketNumber;
        this.licensePlate = licensePlate;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.amountPaid = amountPaid;
        this.paymentMethod = paymentMethod;
        this.generatedAt = LocalDateTime.now();
    }

    public String getSlipNumber() {
        return slipNumber;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public PaymentMethodType getPaymentMethod() {
        return paymentMethod;
    }

    public LocalDateTime getGeneratedAt() {
        return generatedAt;
    }
}