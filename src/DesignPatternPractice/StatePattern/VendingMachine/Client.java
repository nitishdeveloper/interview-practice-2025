package DesignPatternPractice.StatePattern.VendingMachine;

public class Client {
    public static void main(String[] args) {
        VendingMachine vendingMachine  = new VendingMachine(2);

        System.out.println("Initial state: " + vendingMachine.getCurrentState());
        System.out.println("Items available: " + vendingMachine.getItemCount());
        System.out.println();

        System.out.println("=== First Purchase ===");
        vendingMachine.insertCoin();
        vendingMachine.selectItem();
        vendingMachine.dispenseItem();
        System.out.println("Current state: " + vendingMachine.getCurrentState());
        System.out.println();

        System.out.println("=== Second Purchase ===");
        vendingMachine.insertCoin();
        vendingMachine.selectItem();
        vendingMachine.dispenseItem();
        System.out.println("Current state: " + vendingMachine.getCurrentState());
        System.out.println();

        // Try to purchase when sold out
        System.out.println("=== Attempt Purchase When Sold Out ===");
        vendingMachine.insertCoin();       // Should be rejected
        vendingMachine.selectItem();      // Should be rejected
        vendingMachine.dispenseItem();   // Should be rejected
        System.out.println();

        // Refill machine
        System.out.println("=== Refill Machine ===");
        vendingMachine.refill(3);
        System.out.println("Current state: " + vendingMachine.getCurrentState());
        System.out.println("Items available: " + vendingMachine.getItemCount());
        System.out.println();

        // Purchase after refill
        System.out.println("=== Purchase After Refill ===");
        vendingMachine.insertCoin();
        vendingMachine.selectItem();
        vendingMachine.dispenseItem();
    }
}
