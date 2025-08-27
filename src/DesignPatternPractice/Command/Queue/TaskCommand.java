package DesignPatternPractice.Command.Queue;

public interface TaskCommand {
    void execute();
    void undo();
}
