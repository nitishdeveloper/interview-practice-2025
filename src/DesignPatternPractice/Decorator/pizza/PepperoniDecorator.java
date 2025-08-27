package DesignPatternPractice.Decorator.pizza;

public class PepperoniDecorator extends PizzaDecorator{
    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Added Pepperoni";
    }

    @Override
    public double cost() {
        return super.cost() + 85;
    }
}
