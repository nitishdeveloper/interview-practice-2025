package DesignPatternPractice.Facade;

public class SmartHomeFacade {
    private final HomeLightSystem homeLightSystem;
    private final SecuritySystem securitySystem;

    public SmartHomeFacade() {
        this.homeLightSystem = new HomeLightSystem();
        this.securitySystem = new SecuritySystem();
    }

    public void autoON(){
        homeLightSystem.lightON();
        securitySystem.securityPass();
    }

    public void autoOFF(){
        homeLightSystem.lightOFF();
        securitySystem.securityFail();
    }
}
