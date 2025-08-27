package DesignPatternPractice.ChianOfResponsiblity.ATM;

public class Rupee100Dispenser implements DispenseChain {
    private DispenseChain dispenseChain;

    @Override
    public void setDispenseChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }

    @Override
    public void dispenseAmount(Currency currency) {
        if (currency.getAmount() >= 100) {
            int numberOfNotes = currency.getAmount() / 100;
            int remender = currency.getAmount() % 100;
            System.out.println("Rupee100Dispenser :: Dispensing " + numberOfNotes + " ₹100 notes");
            if (remender != 0) {
                dispenseChain.dispenseAmount(new Currency(remender));
            }
        } else {
            System.out.println("Rupee100Dispenser : sending request to another chain");
            dispenseChain.dispenseAmount(currency);
        }
    }
}
