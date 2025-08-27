package DesignPatternPractice.Decorator.pizza;

public class PizzaHouse {
    public static void main(String[] args) {
        Pizza pizza = new BasePizza();
        System.out.println(pizza.getDescription());
        System.out.println("pizza cost: " + pizza.cost());

        pizza = new MushroomDecorator(pizza);
        System.out.println(pizza.getDescription());
        System.out.println("pizza cost: " + pizza.cost());

        pizza = new CheeseBustDecorator(pizza);
        System.out.println(pizza.getDescription());
        System.out.println("pizza cost: " + pizza.cost());

        pizza = new PepperoniDecorator(pizza);
        System.out.println(pizza.getDescription());
        System.out.println("pizza cost: " + pizza.cost());
    }
}
