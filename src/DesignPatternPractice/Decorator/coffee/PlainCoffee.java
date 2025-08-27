package DesignPatternPractice.Decorator.coffee;

public class PlainCoffee implements Coffee{
    @Override
    public String getIngredient() {
        return "Plain Coffee ";
    }

    @Override
    public double cost() {
        return 50;
    }
}
