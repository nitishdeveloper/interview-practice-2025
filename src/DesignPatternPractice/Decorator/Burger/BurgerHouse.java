package DesignPatternPractice.Decorator.Burger;

public class BurgerHouse {
    public static void main(String[] args) {
        Burger burger = new BasicBurger();
        System.out.println("burger: " + burger.ingredient() + " cost: " + burger.cost());

        burger = new AlooPetiDecorator(burger);
        System.out.println("burger: " + burger.ingredient() + " cost: " + burger.cost());

        burger = new ExtraCheesDecorator(burger);
        System.out.println("burger: " + burger.ingredient() + " cost: " + burger.cost());

        burger = new PaneerPetiDecorator(burger);
        System.out.println("burger: " + burger.ingredient() + " cost: " + burger.cost());

    }
}
