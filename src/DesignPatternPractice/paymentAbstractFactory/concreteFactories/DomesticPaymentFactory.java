package DesignPatternPractice.paymentAbstractFactory.concreteFactories;

import DesignPatternPractice.paymentAbstractFactory.abstractFactory.PaymentFactory;
import DesignPatternPractice.paymentAbstractFactory.PaymentType;
import DesignPatternPractice.paymentAbstractFactory.UnsupportedPaymentException;
import DesignPatternPractice.paymentAbstractFactory.abstractProducts.Payment;
import DesignPatternPractice.paymentAbstractFactory.concreateProducts.BharatPe;
import DesignPatternPractice.paymentAbstractFactory.concreateProducts.GooglePe;
import DesignPatternPractice.paymentAbstractFactory.concreateProducts.PhonePe;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class DomesticPaymentFactory implements PaymentFactory {
    private static final Map<PaymentType, Payment> domesticPaymentMap = new HashMap<>();

    static {
        domesticPaymentMap.put(PaymentType.PhonePe, new PhonePe());
        domesticPaymentMap.put(PaymentType.BharatPe, new BharatPe());
        domesticPaymentMap.put(PaymentType.GooglePe, new GooglePe());
    }

    @Override
    public Payment getPayment(PaymentType paymentType) {
        return Optional.ofNullable(domesticPaymentMap.get(paymentType)).orElseThrow(() -> new UnsupportedPaymentException(paymentType));
    }
}
