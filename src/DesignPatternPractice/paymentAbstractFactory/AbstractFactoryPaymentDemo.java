package DesignPatternPractice.paymentAbstractFactory;

import DesignPatternPractice.paymentAbstractFactory.abstractFactory.PaymentFactory;
import DesignPatternPractice.paymentAbstractFactory.abstractFactory.PaymentFactoryRegistry;
import DesignPatternPractice.paymentAbstractFactory.abstractFactory.PaymentProcessor;
import DesignPatternPractice.paymentAbstractFactory.abstractProducts.Payment;
import DesignPatternPractice.paymentAbstractFactory.concreateProducts.*;
import DesignPatternPractice.paymentAbstractFactory.concreteFactories.GenericPaymentFactory;

import java.util.HashMap;
import java.util.Map;

public class AbstractFactoryPaymentDemo {
    private static final Map<PaymentType, Payment> domesticPaymentMap = new HashMap<>();
    private static final Map<PaymentType, Payment> internationalPaymentMap = new HashMap<>();

    static {
        internationalPaymentMap.put(PaymentType.RazorPe, new RazorPe());
        internationalPaymentMap.put(PaymentType.PaypalPe, new PaypalPe());
        internationalPaymentMap.put(PaymentType.StripePe, new StripePe());
    }

    static {
        domesticPaymentMap.put(PaymentType.PhonePe, new PhonePe());
        domesticPaymentMap.put(PaymentType.BharatPe, new BharatPe());
        domesticPaymentMap.put(PaymentType.GooglePe, new GooglePe());
    }

    public static void main(String[] args) {

        PaymentFactoryRegistry paymentFactoryRegistry = new PaymentFactoryRegistry();
        PaymentFactory domesticFactory = new GenericPaymentFactory(domesticPaymentMap);
        PaymentFactory internationalFactory = new GenericPaymentFactory(internationalPaymentMap);

        paymentFactoryRegistry.registerPaymentFactory(PaymentCategory.Domestic, domesticFactory);
        paymentFactoryRegistry.registerPaymentFactory(PaymentCategory.International, internationalFactory);


//        paymentFactoryRegistry.registerPaymentFactory(PaymentCategory.Domestic, new DomesticPaymentFactory());
//        paymentFactoryRegistry.registerPaymentFactory(PaymentCategory.International, new InternationalPaymentFactory());

        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentFactoryRegistry);
        paymentProcessor.processPayment(PaymentCategory.International, PaymentType.RazorPe, 75);
    }

}
