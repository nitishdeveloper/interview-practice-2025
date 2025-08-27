package DesignPatternPractice.Bridge.RemoteControl.abstraction;

import DesignPatternPractice.Bridge.RemoteControl.implementor.Device;

public abstract class RemoteControl {
    protected final Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void mute() {
        System.out.println("Mute feature is not available on this remote.");
    }

    public abstract void power();

    public abstract void volumeUp();

    public abstract void volumeDown();

    public abstract void nextChannel();

    public abstract void previousChannel();
}
