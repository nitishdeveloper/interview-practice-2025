package DesignPatternPractice.Decorator.pizza;

public class MushroomDecorator extends PizzaDecorator{
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Added Mushroom on top";
    }

    @Override
    public double cost() {
        return super.cost() + 95;
    }
}
