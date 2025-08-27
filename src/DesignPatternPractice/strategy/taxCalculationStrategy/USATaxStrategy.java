package DesignPatternPractice.strategy.taxCalculationStrategy;

public class USATaxStrategy implements TaxStrategy {
    final double usaTaxPercent = 25;

    @Override
    public void calculateTax(double amount) {
        System.out.printf("USA tax calculation for amount: %s is %s", amount, getFinalAmountAfterTaxDeduction(amount));
    }

    private double getFinalAmountAfterTaxDeduction(double amount) {
        return amount - (amount * usaTaxPercent / 100);
    }
}
