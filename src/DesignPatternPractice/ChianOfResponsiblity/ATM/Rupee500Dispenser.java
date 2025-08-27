package DesignPatternPractice.ChianOfResponsiblity.ATM;

public class Rupee500Dispenser implements DispenseChain {
    private DispenseChain dispenseChain;

    @Override
    public void setDispenseChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }

    @Override
    public void dispenseAmount(Currency currency) {
        if (currency.getAmount() >= 500) {
            int numberOfNotes = currency.getAmount() / 500;
            int remender = currency.getAmount() % 500;
            System.out.println("Rupee500Dispenser :: Dispensing " + numberOfNotes + " ₹500 notes");
            if (remender != 0) {
                dispenseChain.dispenseAmount(new Currency(remender));
            }
        } else {
            System.out.println("Rupee500Dispenser : sending request to another chain");
            dispenseChain.dispenseAmount(currency);
        }
    }
}
