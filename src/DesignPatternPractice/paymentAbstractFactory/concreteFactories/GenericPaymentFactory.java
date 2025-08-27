package DesignPatternPractice.paymentAbstractFactory.concreteFactories;

import DesignPatternPractice.paymentAbstractFactory.abstractFactory.PaymentFactory;
import DesignPatternPractice.paymentAbstractFactory.PaymentType;
import DesignPatternPractice.paymentAbstractFactory.UnsupportedPaymentException;
import DesignPatternPractice.paymentAbstractFactory.abstractProducts.Payment;

import java.util.Map;
import java.util.Optional;

public class GenericPaymentFactory implements PaymentFactory {
    private final Map<PaymentType, Payment> payments;

    public GenericPaymentFactory(Map<PaymentType, Payment> payments) {
        this.payments = payments;
    }

    @Override
    public Payment getPayment(PaymentType type) {
        return Optional.ofNullable(payments.get(type)).orElseThrow(() -> new UnsupportedPaymentException(type));
    }
}
