package DesignPatternPractice.strategy.taxCalculationStrategy;

public class Client {
    public static void main(String[] args) {
        TaxStrategyContext indiaTax = new TaxStrategyContext(new IndiaTaxStrategy());
        indiaTax.sendMoney(100000);
        System.out.println();
        TaxStrategyContext usaTax = new TaxStrategyContext(new USATaxStrategy());
        usaTax.sendMoney(100000);
        System.out.println();
        TaxStrategyContext ukTax = new TaxStrategyContext(new UKTaxStrategy());
        ukTax.sendMoney(100000);

    }
}
