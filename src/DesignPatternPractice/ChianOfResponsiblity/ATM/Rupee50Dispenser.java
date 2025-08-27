package DesignPatternPractice.ChianOfResponsiblity.ATM;

public class Rupee50Dispenser implements DispenseChain {
    private DispenseChain dispenseChain;

    @Override
    public void setDispenseChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }

    @Override
    public void dispenseAmount(Currency currency) {
        if (currency.getAmount() >= 50) {
            int num = currency.getAmount() / 50;
            int remender = currency.getAmount() % 50;
            System.out.println("Rupee50Dispenser :: Dispensing " + num + " ₹50 notes");
            if (remender != 0) {
                dispenseChain.dispenseAmount(new Currency(remender));
            }
        } else {
            System.out.println("Rupee50Dispenser :: Cannot dispense amount: " + currency.getAmount());
        }
    }
}