package DesignPatternPractice.Command.RemoteControl;

public class RemoteControl_Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
