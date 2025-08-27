package DesignPatternPractice.ChianOfResponsiblity.ATM;

public class Rupee200Dispenser implements DispenseChain {
    private DispenseChain dispenseChain;

    @Override
    public void setDispenseChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }

    @Override
    public void dispenseAmount(Currency currency) {
        if (currency.getAmount() >= 200) {
            int num = currency.getAmount() / 200;
            int remender = currency.getAmount() % 200;
            System.out.println("Rupee200Dispenser :: Dispensing " + num + " ₹200 notes");
            if (remender != 0) {
                dispenseChain.dispenseAmount(new Currency(remender));
            }
        } else {
            System.out.println("Rupee200Dispenser : sending request to another chain");
            dispenseChain.dispenseAmount(currency);
        }
    }
}