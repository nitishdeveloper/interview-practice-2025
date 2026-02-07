package LowLevelDesign.logger;

public enum LogLevel {
    ERROR(4),
    WARN(3),
    INFO(2),
    DEBUG(1);

    private final int priority;

    LogLevel(int priority) {
        this.priority = priority;
    }

    public int priority() {
        return priority;
    }
}
