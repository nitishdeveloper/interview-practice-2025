package DesignPatternPractice.strategy.paymentStrategy;

public class PaymentStrategyContext {
    PaymentStrategy paymentStrategy;

    public PaymentStrategyContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(double amount) {
        paymentStrategy.pay(amount);
    }
}
