package DesignPatternPractice.Decorator.Burger;

public class BasicBurger implements Burger {
    @Override
    public String ingredient() {
        return "Basic Burger";
    }

    @Override
    public double cost() {
        return 60;
    }
}
