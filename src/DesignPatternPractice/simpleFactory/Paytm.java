package DesignPatternPractice.simpleFactory;

public class Paytm implements Payment{
    @Override
    public void pay(int amount) {
        System.out.printf("Received payment amount %s from Paytm%n",amount);
    }
}
