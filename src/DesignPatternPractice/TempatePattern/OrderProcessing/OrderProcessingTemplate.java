package DesignPatternPractice.TempatePattern.OrderProcessing;

public abstract class OrderProcessingTemplate {
    public final void processOrder(){
        selectItem();
        makePayment();
        deliver();
    }

    private void selectItem(){
        System.out.println("Item has been selected");
    }

    private void deliver(){
        System.out.println("Item has been delivered to the customer");
    }
    protected abstract void makePayment();
}
