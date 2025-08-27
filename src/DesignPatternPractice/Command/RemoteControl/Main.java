package DesignPatternPractice.Command.RemoteControl;

public class Main {
    public static void main(String[] args) {
        Light_Receiver lightReceiver = new Light_Receiver();

        Command lightON = new LightOnCommand(lightReceiver);
        Command lightOFF = new LightOFFCommand(lightReceiver);

        RemoteControl_Invoker controlInvoker = new RemoteControl_Invoker();
        controlInvoker.setCommand(lightON);
        controlInvoker.pressButton();

        controlInvoker.setCommand(lightOFF);
        controlInvoker.pressButton();
    }
}
