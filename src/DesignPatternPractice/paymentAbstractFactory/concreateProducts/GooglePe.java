package DesignPatternPractice.paymentAbstractFactory.concreateProducts;

import DesignPatternPractice.paymentAbstractFactory.abstractProducts.Payment;

public class GooglePe implements Payment {
    @Override
    public void pay(int amount) {
        System.out.printf("Received payment amount %s from GooglePe",amount);
    }
}
