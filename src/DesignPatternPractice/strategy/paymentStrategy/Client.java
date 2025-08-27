package DesignPatternPractice.strategy.paymentStrategy;

public class Client {
    public static void main(String[] args) {
        PaymentStrategyContext paymentStrategyContext = new PaymentStrategyContext(new UPIPaymentStrategy());
        paymentStrategyContext.makePayment(100);

        PaymentStrategyContext paymentStrategyContext1 = new PaymentStrategyContext(new CardPaymentStrategy());
        paymentStrategyContext1.makePayment(45);

        PaymentStrategyContext paymentStrategyContext2 = new PaymentStrategyContext(new NetBankingPaymentStrategy());
        paymentStrategyContext2.makePayment(345);

        PaymentStrategyContext paymentStrategyContext3 = new PaymentStrategyContext(new CardPaymentStrategy());
        paymentStrategyContext3.makePayment(234);
    }
}
