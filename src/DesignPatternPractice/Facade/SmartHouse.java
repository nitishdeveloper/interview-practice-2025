package DesignPatternPractice.Facade;

public class SmartHouse {
    public static void main(String[] args) {
        SmartHomeFacade home = new SmartHomeFacade();
        home.autoON();
    }
}
