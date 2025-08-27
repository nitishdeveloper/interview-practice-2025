package LowLevelDesign.ParkingLot.payment;

import LowLevelDesign.ParkingLot.parking.ParkingTicket;

public class PaymentReceipt {
    private final ParkingTicket ticket;
    private final PaymentResult paymentResult;

    public PaymentReceipt(ParkingTicket ticket, PaymentResult paymentResult) {
        this.ticket = ticket;
        this.paymentResult = paymentResult;
    }

    public ParkingTicket getTicket() {
        return ticket;
    }

    public PaymentResult getPaymentResult() {
        return paymentResult;
    }

    @Override
    public String toString() {
        return "PaymentReceipt{" +
                "ticket=" + ticket +
                ", paymentResult=" + paymentResult +
                '}';
    }
}