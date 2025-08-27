package DesignPatternPractice.Decorator.coffee;

public class Design extends CoffeeDecorator{
    public Design(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getIngredient() {
        return super.getIngredient()+",make a design on coffee";
    }

    @Override
    public double cost() {
        return super.cost() + 75;
    }
}
