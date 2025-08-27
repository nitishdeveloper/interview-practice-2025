package DesignPatternPractice.simpleFactory;

public class MediumBurger implements Burger {
    @Override
    public void prepareBurger() {
        System.out.println("Medium Burger is created");
    }
}
