package DesignPatternPractice.strategy.paymentStrategy;

public class NetBankingPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Hey,I'm using net banking payment: "+amount);
    }
}
