package DesignPatternPractice.Bridge.RemoteControl;

import DesignPatternPractice.Bridge.RemoteControl.abstraction.RemoteControl;
import DesignPatternPractice.Bridge.RemoteControl.concreteAbstraction.AdvancedRemote;
import DesignPatternPractice.Bridge.RemoteControl.concreteAbstraction.BasicRemote;
import DesignPatternPractice.Bridge.RemoteControl.concreteImplementor.Radio;
import DesignPatternPractice.Bridge.RemoteControl.concreteImplementor.TV;
import DesignPatternPractice.Bridge.RemoteControl.implementor.Device;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl remoteControl = new BasicRemote(tv);
        remoteControl.power();
        remoteControl.volumeUp();
        remoteControl.nextChannel();
        remoteControl.mute();

        Device radio = new Radio();
        RemoteControl remoteControl1 = new AdvancedRemote(radio);
        remoteControl1.power();
        remoteControl.volumeUp();
        remoteControl1.nextChannel();
        remoteControl1.mute();
    }
}
