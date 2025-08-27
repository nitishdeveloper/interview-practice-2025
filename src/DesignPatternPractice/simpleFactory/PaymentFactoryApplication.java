package DesignPatternPractice.simpleFactory;

public class PaymentFactoryApplication {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory();
        paymentFactory.getPayment(PaymentType.PhonePe).pay(100);
        paymentFactory.getPayment(PaymentType.Paytm).pay(80);
        paymentFactory.getPayment(PaymentType.GooglePe).pay(50);

    }
}
