package DesignPatternPractice.paymentAbstractFactory;

public class PaymentFactoryNotRegisteredException extends RuntimeException {
    public PaymentFactoryNotRegisteredException(PaymentCategory category) {
        super("No factory registered for category: " + category);
    }
}
