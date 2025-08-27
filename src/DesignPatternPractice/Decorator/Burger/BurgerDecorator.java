package DesignPatternPractice.Decorator.Burger;

public abstract class BurgerDecorator implements Burger {
    private final Burger burger;

    public BurgerDecorator(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String ingredient() {
        return burger.ingredient();
    }

    @Override
    public double cost() {
        return burger.cost();
    }
}
