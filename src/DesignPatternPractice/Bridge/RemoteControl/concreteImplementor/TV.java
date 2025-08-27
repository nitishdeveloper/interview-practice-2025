package DesignPatternPractice.Bridge.RemoteControl.concreteImplementor;

import DesignPatternPractice.Bridge.RemoteControl.implementor.Device;

public class TV implements Device {
    private boolean isOn = false;
    private int volume = 50;
    private int channel = 1;

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("TV turn ON");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println("TV turn OFF");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV set volume: "+volume);
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("TV channel changed: "+channel);
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public int getChannel() {
        return channel;
    }
}
