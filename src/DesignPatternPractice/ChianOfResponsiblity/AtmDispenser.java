package DesignPatternPractice.ChianOfResponsiblity;

import DesignPatternPractice.ChianOfResponsiblity.ATM.*;

public class AtmDispenser {
    private final DispenseChain chain1;

    public AtmDispenser() {
        // initialize the chain
        this.chain1 = new Rupee500Dispenser();
        DispenseChain chain2 = new Rupee200Dispenser();
        DispenseChain chain3 = new Rupee100Dispenser();
        DispenseChain chain4 = new Rupee50Dispenser();

        // setting the chain of responsibility
        chain1.setDispenseChain(chain2);
        chain2.setDispenseChain(chain3);
        chain3.setDispenseChain(chain4);
    }

    public void dispense(int amount){
        if(amount % 50 != 0){
            System.out.println("Amount should be in multiples of 50");
            return;
        }
        chain1.dispenseAmount(new Currency(amount));
    }

    public static void main(String[] args) {
        AtmDispenser atm = new AtmDispenser();
        atm.dispense(2500);
    }
}
