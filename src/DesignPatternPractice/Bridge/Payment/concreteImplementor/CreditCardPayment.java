package DesignPatternPractice.Bridge.Payment.concreteImplementor;

import DesignPatternPractice.Bridge.Payment.implementor.PaymentMethod;

public class CreditCardPayment implements PaymentMethod {
    private double amount;

    @Override
    public void processPayment(double amount) {
        this.amount = amount;
        System.out.println("Credit card payment method :: amount: " + amount);
    }

    public double getAmount() {
        return amount;
    }
}
