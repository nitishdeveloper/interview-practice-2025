package DesignPatternPractice.Decorator.Burger;

public class CheesDecorator extends BurgerDecorator{
    public CheesDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String ingredient() {
        return super.ingredient();
    }

    @Override
    public double cost() {
        return super.cost();
    }
}
