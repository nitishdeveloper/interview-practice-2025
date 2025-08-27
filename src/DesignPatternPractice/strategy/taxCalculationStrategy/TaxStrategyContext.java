package DesignPatternPractice.strategy.taxCalculationStrategy;

public class TaxStrategyContext {
    private final TaxStrategy taxStrategy;

    public TaxStrategyContext(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public void sendMoney(double amount) {
        taxStrategy.calculateTax(amount);
    }
}
