package DesignPatternPractice.TempatePattern.OrderProcessing;

public class CreditCardPayment extends OrderProcessingTemplate{
    @Override
    public void makePayment() {
        System.out.println("Payment received from CC");
    }
}
