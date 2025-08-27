package DesignPatternPractice.strategy.taxCalculationStrategy;

public class IndiaTaxStrategy implements TaxStrategy {
    final double indiaTaxPercent = 20;

    @Override
    public void calculateTax(double amount) {
        System.out.printf("India tax calculation for amount: %s is %s", amount, getFinalAmountAfterTaxDeduction(amount));
    }

    private double getFinalAmountAfterTaxDeduction(double amount) {
        return amount - (amount * indiaTaxPercent / 100);
    }
}
