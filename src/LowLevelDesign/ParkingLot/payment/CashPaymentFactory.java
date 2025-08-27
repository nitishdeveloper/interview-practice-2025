package LowLevelDesign.ParkingLot.payment;

public class CashPaymentFactory implements PaymentFactory {
    @Override
    public PaymentStrategy createPaymentStrategy() {
        return new CashPaymentStrategy();
    }
}