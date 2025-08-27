package DesignPatternPractice.Decorator.Burger;

public class AlooPetiDecorator extends BurgerDecorator{
    public AlooPetiDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String ingredient() {
        return super.ingredient()+" aloo peti";
    }

    @Override
    public double cost() {
        return super.cost()+15;
    }
}