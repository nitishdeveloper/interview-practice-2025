package DesignPatternPractice.paymentAbstractFactory.abstractFactory;

import DesignPatternPractice.paymentAbstractFactory.PaymentCategory;
import DesignPatternPractice.paymentAbstractFactory.PaymentType;

public class PaymentProcessor {
    private final PaymentFactoryRegistry paymentFactoryRegistry;

    public PaymentProcessor(PaymentFactoryRegistry paymentFactoryRegistry) {
        this.paymentFactoryRegistry = paymentFactoryRegistry;
    }

    public void processPayment(PaymentCategory paymentCategory, PaymentType paymentType, int amount) {
        PaymentFactory paymentFactory = paymentFactoryRegistry.getPaymentFactory(paymentCategory);
        if (paymentFactory == null) {
            throw new RuntimeException("No factory registered for category: " + paymentCategory);
        }
        paymentFactory.getPayment(paymentType).pay(amount);
    }
}
