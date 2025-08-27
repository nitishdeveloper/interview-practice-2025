package LowLevelDesign.ParkingLot.payment;

public interface PaymentStrategy {
    boolean processPayment(double amount);
}