package DesignPatternPractice.StatePattern.VendingMachine;

public interface VendingMachineState {
    void insertCoin();
    void selectItem();
    void dispenseItem();
}
