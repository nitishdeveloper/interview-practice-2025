package DesignPatternPractice.strategy.paymentStrategy;

public class UPIPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Hey,I'm using upi payment: "+amount);
    }
}
