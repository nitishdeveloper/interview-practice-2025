package DesignPatternPractice.TempatePattern.OrderProcessing;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        OrderProcessingTemplate template = new CreditCardPayment();
        template.processOrder();

        OrderProcessingTemplate template1 = new DebitCardPayment();
        template1.processOrder();
    }
}
