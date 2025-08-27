package DesignPatternPractice.strategy.paymentStrategy;

public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Hey,I'm using card payment: " + amount);
    }
}
