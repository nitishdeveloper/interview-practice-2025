package DesignPatternPractice.simpleFactory;

public class LargeBurger implements Burger {
    @Override
    public void prepareBurger() {
        System.out.println("Large Burger is created");
    }
}