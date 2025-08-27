package DesignPatternPractice.Bridge.RemoteControl.concreteAbstraction;

import DesignPatternPractice.Bridge.RemoteControl.abstraction.RemoteControl;
import DesignPatternPractice.Bridge.RemoteControl.implementor.Device;

public class AdvancedRemote extends RemoteControl {
    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void power() {
        if (device.isOn()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }

    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume() + 1);
    }

    @Override
    public void volumeDown() {
        device.setVolume(device.getVolume() - 1);
    }

    @Override
    public void nextChannel() {
        device.setChannel(device.getChannel() + 1);
    }

    @Override
    public void previousChannel() {
        device.setChannel(device.getChannel() - 1);
    }

    public void mute() {
        device.setVolume(0);
    }
}
