package DesignPatternPractice.Bridge.Payment.abstraction;

import DesignPatternPractice.Bridge.Payment.implementor.PaymentMethod;

public abstract class PaymentProcessor {
    protected final PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public abstract void processPayment(double amount);
}
