package LowLevelDesign.ParkingLot.payment;

public interface PaymentFactory {
    PaymentStrategy createPaymentStrategy();
}
