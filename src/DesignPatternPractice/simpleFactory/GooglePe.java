package DesignPatternPractice.simpleFactory;

public class GooglePe implements Payment{
    @Override
    public void pay(int amount) {
        System.out.printf("Received payment amount %s from GooglePe%n",amount);
    }
}
