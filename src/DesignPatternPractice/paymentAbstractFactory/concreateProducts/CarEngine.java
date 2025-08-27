package DesignPatternPractice.paymentAbstractFactory.concreateProducts;

import DesignPatternPractice.paymentAbstractFactory.abstractProducts.Engine;

public class CarEngine implements Engine {
    @Override
    public void design() {
        System.out.println("Engine has design for Car");
    }
}
