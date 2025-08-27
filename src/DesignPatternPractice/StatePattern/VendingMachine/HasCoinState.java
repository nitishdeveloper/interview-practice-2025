package DesignPatternPractice.StatePattern.VendingMachine;

public class HasCoinState implements VendingMachineState {

    private final VendingMachine vendingMachine;

    public HasCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted");
    }

    @Override
    public void selectItem() {
        if(vendingMachine.getItemCount() > 0){
            System.out.println("Item Selected");
            vendingMachine.setState(vendingMachine.getSoldState());
        }else{
            System.out.println("Item out of stock - coin returned");
            vendingMachine.setState(vendingMachine.getNoCoinState());
        }
    }

    @Override
    public void dispenseItem() {
        System.out.println("Please select an item first");
    }

    @Override
    public String toString() {
        return "Has Coin State";
    }
}

