package DesignPatternPractice.Adepter.plugin;

public class MobileClient {
    public static void main(String[] args) {
        EuropeanPlug europeanPlug = new EuropeanPlug();
        IndianSocket indianSocket = new PlugAdapter(europeanPlug);
        indianSocket.givePower();
    }
}
