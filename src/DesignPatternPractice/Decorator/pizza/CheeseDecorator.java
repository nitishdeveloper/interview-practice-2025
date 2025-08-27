package DesignPatternPractice.Decorator.pizza;

public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Extra Cheese";
    }

    @Override
    public double cost() {
        return super.cost() + 50;
    }
}
