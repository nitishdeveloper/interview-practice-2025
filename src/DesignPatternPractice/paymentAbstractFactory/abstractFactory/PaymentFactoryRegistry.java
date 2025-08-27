package DesignPatternPractice.paymentAbstractFactory.abstractFactory;

import DesignPatternPractice.paymentAbstractFactory.PaymentCategory;
import DesignPatternPractice.paymentAbstractFactory.PaymentFactoryNotRegisteredException;

import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;

public class PaymentFactoryRegistry {
    private final Map<PaymentCategory, PaymentFactory> paymentFactoryMap = new EnumMap<>(PaymentCategory.class);

    public void registerPaymentFactory(PaymentCategory category, PaymentFactory factory) {
        paymentFactoryMap.put(category, factory);
    }

    public PaymentFactory getPaymentFactory(PaymentCategory category) {
        return Optional.ofNullable(paymentFactoryMap.get(category)).orElseThrow(() -> new PaymentFactoryNotRegisteredException(category));
    }
}
