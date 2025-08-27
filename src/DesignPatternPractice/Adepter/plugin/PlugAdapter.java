package DesignPatternPractice.Adepter.plugin;

public class PlugAdapter implements IndianSocket {
    private final EuropeanPlug europeanPlug;

    public PlugAdapter(EuropeanPlug europeanPlug) {
        this.europeanPlug = europeanPlug;
    }

    @Override
    public void givePower() {
        System.out.println("Using plug adapter...");
        europeanPlug.provideEuropeanPower();  // Adapting
        System.out.println("Converted to Indian socket (3-pin)");
    }
}
