package DesignPatternPractice.Command.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class TaskScheduler_Invoker {
    private final Queue<TaskCommand> taskQueue = new ArrayDeque<>();
    private final Deque<TaskCommand> history = new ArrayDeque<>();
    private boolean isProcessing = false;

    public void addTask(TaskCommand task) {
        taskQueue.add(task);
        System.out.println("Added to queue: " + task);
    }

    public void processTasks() {
        isProcessing = true;
        new Thread(() -> {
            while (!taskQueue.isEmpty()) {
                TaskCommand task = taskQueue.poll();
                try {
                    System.out.println("Executing: " + task);
                    task.execute();
                    history.push(task);
                } catch (Exception e) {
                    System.err.println("Task failed: " + task + " - " + e.getMessage());
                }
            }
            isProcessing = false;
        }).start();
    }

    public void displayQueueStatus() {
        System.out.println("\n=== Queue Status ===");
        System.out.println("Pending tasks: " + taskQueue.size());
        System.out.println("Completed tasks: " + history.size());
        System.out.println("Currently processing: " + isProcessing);
    }

}
