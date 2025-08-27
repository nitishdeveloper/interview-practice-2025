package DesignPatternPractice.Decorator.coffee;

public class Cream extends CoffeeDecorator{
    public Cream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getIngredient() {
        return super.getIngredient()+",cream";
    }

    @Override
    public double cost() {
        return super.cost()+ 29;
    }
}
