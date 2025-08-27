package DesignPatternPractice.Decorator.pizza;

public class BasePizza implements Pizza{
    @Override
    public String getDescription() {
        return "Base Pizza ";
    }

    @Override
    public double cost() {
        return 100;
    }
}
