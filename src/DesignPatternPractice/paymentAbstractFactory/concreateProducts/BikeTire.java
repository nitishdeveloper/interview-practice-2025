package DesignPatternPractice.paymentAbstractFactory.concreateProducts;

import DesignPatternPractice.paymentAbstractFactory.abstractProducts.Tire;

public class BikeTire implements Tire {
    @Override
    public void manufacture() {
        System.out.println("Tire's has design for Bike");
    }
}
