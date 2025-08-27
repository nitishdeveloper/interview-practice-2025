package DesignPatternPractice.Decorator.coffee;

public class ChocolateCoffee extends CoffeeDecorator{
    public ChocolateCoffee(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getIngredient() {
        return super.getIngredient()+",chocolate";
    }

    @Override
    public double cost() {
        return super.cost() + 25;
    }
}
