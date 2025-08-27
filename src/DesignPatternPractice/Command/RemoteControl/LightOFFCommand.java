package DesignPatternPractice.Command.RemoteControl;

public class LightOFFCommand implements Command {
    private final Light_Receiver lightReceiver;

    public LightOFFCommand(Light_Receiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.lightOFF();
    }
}
