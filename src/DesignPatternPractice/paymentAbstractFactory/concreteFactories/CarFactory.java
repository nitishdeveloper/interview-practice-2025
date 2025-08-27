package DesignPatternPractice.paymentAbstractFactory.concreteFactories;

import DesignPatternPractice.paymentAbstractFactory.abstractFactory.VehicleFactory;
import DesignPatternPractice.paymentAbstractFactory.abstractProducts.Engine;
import DesignPatternPractice.paymentAbstractFactory.abstractProducts.Tire;
import DesignPatternPractice.paymentAbstractFactory.concreateProducts.CarEngine;
import DesignPatternPractice.paymentAbstractFactory.concreateProducts.CarTire;

public class CarFactory implements VehicleFactory {
    @Override
    public Engine createEngine() {
        return new CarEngine();
    }

    @Override
    public Tire createTire() {
        return new CarTire();
    }
}
