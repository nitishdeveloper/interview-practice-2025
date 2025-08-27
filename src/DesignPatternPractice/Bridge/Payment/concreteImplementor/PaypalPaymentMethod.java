package DesignPatternPractice.Bridge.Payment.concreteImplementor;

import DesignPatternPractice.Bridge.Payment.implementor.PaymentMethod;

public class PaypalPaymentMethod  implements PaymentMethod {
    private double amount;

    @Override
    public void processPayment(double amount) {
        this.amount = amount;
        System.out.println("Paypal payment method :: amount: " + amount);
    }

    public double getAmount() {
        return amount;
    }
}

