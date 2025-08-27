package DesignPatternPractice.paymentAbstractFactory.abstractFactory;

import DesignPatternPractice.paymentAbstractFactory.abstractProducts.Engine;
import DesignPatternPractice.paymentAbstractFactory.abstractProducts.Tire;

public interface VehicleFactory {
    Engine createEngine();
    Tire createTire();
}
