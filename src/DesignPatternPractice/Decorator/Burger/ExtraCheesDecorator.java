package DesignPatternPractice.Decorator.Burger;

public class ExtraCheesDecorator extends BurgerDecorator{
    public ExtraCheesDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String ingredient() {
        return super.ingredient()+" extra chees";
    }

    @Override
    public double cost() {
        return super.cost()+35;
    }
}
