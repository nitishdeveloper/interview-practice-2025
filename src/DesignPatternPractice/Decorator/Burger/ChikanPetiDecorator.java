package DesignPatternPractice.Decorator.Burger;

public class ChikanPetiDecorator extends BurgerDecorator{
    public ChikanPetiDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String ingredient() {
        return super.ingredient()+" chikan peti";
    }

    @Override
    public double cost() {
        return super.cost()+85;
    }
}