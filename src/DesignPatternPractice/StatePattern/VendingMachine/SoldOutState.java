package DesignPatternPractice.StatePattern.VendingMachine;

public class SoldOutState implements VendingMachineState {
    private final VendingMachine vendingMachine;

    public SoldOutState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Cannot accept coins - machine is sold out");
    }

    @Override
    public void selectItem() {
        System.out.println("No items available - machine is sold out");
    }

    @Override
    public void dispenseItem() {
        System.out.println("No items to dispense - machine is sold out");
    }

    @Override
    public String toString() {
        return "Sold Out State";
    }
}
