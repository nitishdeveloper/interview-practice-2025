package DesignPatternPractice.Decorator.coffee;

public class CoffeeDecorator implements Coffee {
    private final Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getIngredient() {
        return coffee.getIngredient();
    }

    @Override
    public double cost() {
        return coffee.cost();
    }
}
