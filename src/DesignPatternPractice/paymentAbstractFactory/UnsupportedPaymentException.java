package DesignPatternPractice.paymentAbstractFactory;

public class UnsupportedPaymentException extends RuntimeException {
    public UnsupportedPaymentException(PaymentType type) {
        super("Unsupported payment type: " + type);
    }
}