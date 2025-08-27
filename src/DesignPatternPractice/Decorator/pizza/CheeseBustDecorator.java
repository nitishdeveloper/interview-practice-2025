package DesignPatternPractice.Decorator.pizza;

public class CheeseBustDecorator extends PizzaDecorator{
    public CheeseBustDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Double chees bust";
    }

    @Override
    public double cost() {
        return super.cost() + 75;
    }
}
