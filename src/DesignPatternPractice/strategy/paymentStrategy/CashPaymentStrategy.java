package DesignPatternPractice.strategy.paymentStrategy;

public class CashPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Hey,I'm using cash payment: "+amount);
    }
}
