package DesignPatternPractice.StatePattern.VendingMachine;

public class SoldState implements VendingMachineState {

    private final VendingMachine vendingMachine;

    public SoldState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please wait, item is being dispensed");
    }

    @Override
    public void selectItem() {
        System.out.println("Please wait, item is being dispensed");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Item dispensed");
        vendingMachine.releaseItem();
    }

    @Override
    public String toString() {
        return "Sold State";
    }
}
