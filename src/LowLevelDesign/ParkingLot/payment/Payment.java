package LowLevelDesign.ParkingLot.payment;

import LowLevelDesign.ParkingLot.parking.ParkingSlip;
import LowLevelDesign.ParkingLot.parking.ParkingTicket;

import java.time.LocalDateTime;
import java.util.UUID;

public class Payment {
    private final String paymentId;
    private final ParkingTicket ticket;
    private final PaymentMethodType paymentMethod;
    private PaymentStatus status;
    private LocalDateTime transactionTime;
    private ParkingSlip slip;

    public Payment(ParkingTicket ticket, PaymentMethodType paymentMethod) {
        this.paymentId = "PAY-" + UUID.randomUUID().toString();
        this.ticket = ticket;
        this.paymentMethod = paymentMethod;
        this.status = PaymentStatus.PENDING;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public ParkingTicket getTicket() {
        return ticket;
    }

    public PaymentMethodType getPaymentMethod() {
        return paymentMethod;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public LocalDateTime getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(LocalDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }

    public ParkingSlip getSlip() {
        return slip;
    }

    public void setSlip(ParkingSlip slip) {
        this.slip = slip;
    }
}