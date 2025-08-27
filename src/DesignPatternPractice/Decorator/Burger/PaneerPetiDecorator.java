package DesignPatternPractice.Decorator.Burger;

public class PaneerPetiDecorator extends BurgerDecorator{
    public PaneerPetiDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String ingredient() {
        return super.ingredient()+ "paneer peti";
    }

    @Override
    public double cost() {
        return super.cost()+45;
    }
}