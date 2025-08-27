package DesignPatternPractice.Bridge.RemoteControl.implementor;

public interface Device {
    void turnOn();
    void turnOff();
    boolean isOn();
    int getVolume();
    int getChannel();
    void setVolume(int volume);
    void setChannel(int channel);
}
