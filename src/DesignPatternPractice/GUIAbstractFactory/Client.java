package DesignPatternPractice.GUIAbstractFactory;

import DesignPatternPractice.GUIAbstractFactory.concreteFactories.LinuxFactory;
import DesignPatternPractice.GUIAbstractFactory.concreteFactories.WindowFactory;

public class Client {
    public static void main(String[] args) {

        Application linuxApp  = new Application(new LinuxFactory());
        linuxApp.createUI();
        linuxApp.renderUI("Linux");
        linuxApp.simulateUserInteraction();

        Application windowApp  = new Application(new WindowFactory());
        windowApp.createUI();
        windowApp.renderUI("Window");
        windowApp.simulateUserInteraction();
    }
}
