package LowLevelDesign.ParkingLot.payment;

public class CardPaymentFactory implements PaymentFactory {
    @Override
    public PaymentStrategy createPaymentStrategy() {
        return new CardPaymentStrategy();
    }
}