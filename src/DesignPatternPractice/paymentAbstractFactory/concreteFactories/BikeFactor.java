package DesignPatternPractice.paymentAbstractFactory.concreteFactories;

import DesignPatternPractice.paymentAbstractFactory.abstractFactory.VehicleFactory;
import DesignPatternPractice.paymentAbstractFactory.abstractProducts.Engine;
import DesignPatternPractice.paymentAbstractFactory.abstractProducts.Tire;
import DesignPatternPractice.paymentAbstractFactory.concreateProducts.BikeEngine;
import DesignPatternPractice.paymentAbstractFactory.concreateProducts.BikeTire;

public class BikeFactor implements VehicleFactory {
    @Override
    public Engine createEngine() {
        return new BikeEngine();
    }

    @Override
    public Tire createTire() {
        return new BikeTire();
    }
}
