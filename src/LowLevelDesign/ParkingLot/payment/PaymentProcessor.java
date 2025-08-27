package LowLevelDesign.ParkingLot.payment;

public class PaymentProcessor {
    private final PaymentFactoryRegistry factoryRegistry;

    public PaymentProcessor(PaymentFactoryRegistry factoryRegistry) {
        this.factoryRegistry = factoryRegistry;
    }

    public PaymentResult processPayment(PaymentRequest request) {
        validateRequest(request);

        PaymentFactory factory = factoryRegistry.getFactory(request.getPaymentMethod());
        PaymentStrategy strategy = factory.createPaymentStrategy();

        boolean success = strategy.processPayment(request.getAmount());
        String message = success ? "Payment successful" : "Payment failed";

        return new PaymentResult(success, message,request.getTransactionId(),request.getAmount());
    }

    private void validateRequest(PaymentRequest request) {
        if (request == null) throw new IllegalArgumentException("Request cannot be null");
        if (request.getAmount() <= 0) throw new IllegalArgumentException("Amount must be positive");
        if (request.getPaymentMethod() == null) throw new IllegalArgumentException("Payment method required");
    }
}