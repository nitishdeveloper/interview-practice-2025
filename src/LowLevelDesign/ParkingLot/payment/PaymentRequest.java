package LowLevelDesign.ParkingLot.payment;
import java.time.LocalDateTime;

public class PaymentRequest {
    private final String transactionId;
    private final double amount;
    private final PaymentMethodType paymentMethod;
    private final LocalDateTime requestTime;
    private final String ticketNumber;

    public PaymentRequest(double amount, PaymentMethodType paymentMethod, String ticketNumber) {
        this.transactionId = "TXN-" + System.currentTimeMillis();
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.ticketNumber = ticketNumber;
        this.requestTime = LocalDateTime.now();
    }

    // Getters
    public String getTransactionId() { return transactionId; }
    public double getAmount() { return amount; }
    public PaymentMethodType getPaymentMethod() { return paymentMethod; }
    public LocalDateTime getRequestTime() { return requestTime; }
    public String getTicketNumber() { return ticketNumber; }
}