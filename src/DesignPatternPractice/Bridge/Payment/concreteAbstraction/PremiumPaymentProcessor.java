package DesignPatternPractice.Bridge.Payment.concreteAbstraction;

import DesignPatternPractice.Bridge.Payment.abstraction.PaymentProcessor;
import DesignPatternPractice.Bridge.Payment.implementor.PaymentMethod;

public class PremiumPaymentProcessor extends PaymentProcessor {

    public PremiumPaymentProcessor(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("process premium payment processor :: "+amount);
        paymentMethod.processPayment(amount);
    }
}
