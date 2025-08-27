package LowLevelDesign.ParkingLot.payment;

public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing card payment: " + amount);
        return Math.random() > 0.1;
    }
}
