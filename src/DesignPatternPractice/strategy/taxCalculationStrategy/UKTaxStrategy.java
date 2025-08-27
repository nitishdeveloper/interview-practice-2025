package DesignPatternPractice.strategy.taxCalculationStrategy;

public class UKTaxStrategy implements TaxStrategy{
    final double ukTaxPercent = 15;

    @Override
    public void calculateTax(double amount) {
        System.out.printf("UK tax calculation for amount: %s is %s", amount, getFinalAmountAfterTaxDeduction(amount));
    }

    private double getFinalAmountAfterTaxDeduction(double amount) {
        return amount - (amount * ukTaxPercent / 100);
    }
}
