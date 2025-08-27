package DesignPatternPractice.Bridge.Payment.concreteAbstraction;

import DesignPatternPractice.Bridge.Payment.abstraction.PaymentProcessor;
import DesignPatternPractice.Bridge.Payment.implementor.PaymentMethod;

public class StandaredPaymentProcessor extends PaymentProcessor {
    public StandaredPaymentProcessor(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("process standared payment processor :: " + amount);
        paymentMethod.processPayment(amount);
    }
}
