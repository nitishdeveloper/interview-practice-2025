package DesignPatternPractice.TempatePattern.OrderProcessing;

public class DebitCardPayment extends OrderProcessingTemplate{
    @Override
    public void makePayment() {
        System.out.println("Payment received from DC");
    }
}
