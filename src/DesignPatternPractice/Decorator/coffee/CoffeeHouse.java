package DesignPatternPractice.Decorator.coffee;

public class CoffeeHouse {
    public static void main(String[] args) {
        Coffee coffee = new PlainCoffee();
        System.out.println("Plain coffee: "+coffee.getIngredient()+" | cost: "+coffee.cost());

        coffee = new Cream(coffee);
        System.out.println("cream : "+coffee.getIngredient()+" | cost: "+coffee.cost());

        coffee = new Design(coffee);
        System.out.println("design : "+coffee.getIngredient()+" | cost: "+coffee.cost());


    }
}
