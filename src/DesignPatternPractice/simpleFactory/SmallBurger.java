package DesignPatternPractice.simpleFactory;

public class SmallBurger implements Burger {
    @Override
    public void prepareBurger() {
        System.out.println("Small Burger is created");
    }
}
