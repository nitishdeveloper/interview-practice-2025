package DesignPatternPractice.paymentAbstractFactory.concreteFactories;

import DesignPatternPractice.paymentAbstractFactory.abstractFactory.PaymentFactory;
import DesignPatternPractice.paymentAbstractFactory.PaymentType;
import DesignPatternPractice.paymentAbstractFactory.UnsupportedPaymentException;
import DesignPatternPractice.paymentAbstractFactory.abstractProducts.Payment;
import DesignPatternPractice.paymentAbstractFactory.concreateProducts.PaypalPe;
import DesignPatternPractice.paymentAbstractFactory.concreateProducts.RazorPe;
import DesignPatternPractice.paymentAbstractFactory.concreateProducts.StripePe;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InternationalPaymentFactory implements PaymentFactory {
    private static final Map<PaymentType, Payment> internationalPaymentMap = new HashMap<>();

    static {
        internationalPaymentMap.put(PaymentType.RazorPe, new RazorPe());
        internationalPaymentMap.put(PaymentType.PaypalPe, new PaypalPe());
        internationalPaymentMap.put(PaymentType.StripePe, new StripePe());
    }

    @Override
    public Payment getPayment(PaymentType paymentType) {
        return Optional.ofNullable(internationalPaymentMap.get(paymentType)).orElseThrow(() -> new UnsupportedPaymentException(paymentType));
    }

}