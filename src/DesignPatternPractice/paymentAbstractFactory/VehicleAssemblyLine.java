package DesignPatternPractice.paymentAbstractFactory;

import DesignPatternPractice.paymentAbstractFactory.abstractFactory.VehicleFactory;
import DesignPatternPractice.paymentAbstractFactory.abstractProducts.Engine;
import DesignPatternPractice.paymentAbstractFactory.abstractProducts.Tire;
import DesignPatternPractice.paymentAbstractFactory.concreteFactories.BikeFactor;

public class VehicleAssemblyLine {
    private final Engine engine;
    private final Tire tire;

    public VehicleAssemblyLine(VehicleFactory vehicleFactory) {
        this.engine = vehicleFactory.createEngine();
        this.tire = vehicleFactory.createTire();
    }

    public void assembleVehicle() {
        engine.design();
        tire.manufacture();
    }
}


class Main {
    public static void main(String[] args) {
        VehicleAssemblyLine vehicleAssemblyLine = new VehicleAssemblyLine(new BikeFactor());
        vehicleAssemblyLine.assembleVehicle();;
    }
}
