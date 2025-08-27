package DesignPatternPractice.Command.RemoteControl;

public class LightOnCommand implements Command{
    private final Light_Receiver lightReceiver;

    public LightOnCommand(Light_Receiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.lightOn();
    }
}
