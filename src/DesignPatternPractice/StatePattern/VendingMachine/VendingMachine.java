package DesignPatternPractice.StatePattern.VendingMachine;

public class VendingMachine {
    private VendingMachineState noCoinState;
    private VendingMachineState hasCoinState;
    private VendingMachineState soldState;
    private VendingMachineState soldOutState;
    private VendingMachineState currentState;
    private int itemCount;

    public VendingMachine(int initialItemCount) {
        this.noCoinState = new NoCoinState(this);
        this.hasCoinState = new HasCoinState(this);
        this.soldState = new SoldState(this);
        this.soldOutState = new SoldOutState(this);
        this.itemCount = initialItemCount;
        this.currentState = itemCount > 0 ? noCoinState : soldOutState;
    }

    public void releaseItem() {
        if (itemCount > 0) {
            itemCount--;
            System.out.println("Item released. Remaining: " + itemCount);
            if (itemCount == 0) {
                setState(soldOutState);
                System.out.println("Machine is now SOLD OUT!");
            } else {
                setState(noCoinState);
            }
        }
    }

    public void refill(int quantity) {
        if (quantity > 0) {
            itemCount += quantity;
            System.out.println("Machine refilled with " + quantity + " items. Total: " + itemCount);
            setState(noCoinState);
        }
    }

    public void setState(VendingMachineState currentState) {
        this.currentState = currentState;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void selectItem() {
        currentState.selectItem();
    }

    public void dispenseItem() {
        currentState.dispenseItem();
    }

    public VendingMachineState getNoCoinState() {
        return noCoinState;
    }

    public VendingMachineState getHasCoinState() {
        return hasCoinState;
    }

    public VendingMachineState getSoldState() {
        return soldState;
    }

    public VendingMachineState getSoldOutState() {
        return soldOutState;
    }

    public VendingMachineState getCurrentState() {
        return currentState;
    }

    public int getItemCount() {
        return itemCount;
    }
}

