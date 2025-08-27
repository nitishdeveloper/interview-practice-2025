package DesignPatternPractice.StatePattern.VendingMachine;

public class NoCoinState implements VendingMachineState {

    private final VendingMachine vendingMachine;

    public NoCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted");
        vendingMachine.setState(vendingMachine.getHasCoinState());
    }

    @Override
    public void selectItem() {
        System.out.println("Please insert a coin first");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Please insert a coin first");
    }

    @Override
    public String toString() {
        return "No Coin State";
    }
}
