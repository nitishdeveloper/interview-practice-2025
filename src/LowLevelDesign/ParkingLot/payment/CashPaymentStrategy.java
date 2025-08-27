package LowLevelDesign.ParkingLot.payment;

public class CashPaymentStrategy implements PaymentStrategy {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing cash payment: " + amount);
        return true;
    }
}