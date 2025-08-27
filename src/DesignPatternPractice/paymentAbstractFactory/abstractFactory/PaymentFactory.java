package DesignPatternPractice.paymentAbstractFactory.abstractFactory;

import DesignPatternPractice.paymentAbstractFactory.PaymentType;
import DesignPatternPractice.paymentAbstractFactory.abstractProducts.Payment;

public interface PaymentFactory {
    Payment getPayment(PaymentType paymentType);
}
