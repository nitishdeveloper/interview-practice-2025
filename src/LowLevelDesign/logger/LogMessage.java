package LowLevelDesign.logger;

public final class LogMessage {

    private final LogLevel logLevel;
    private final String message;
    private final long timestamp;
    private final String threadName;
    private final String className;
    private final String traceId;
    private final String spanId;

    public LogMessage(LogLevel level,
                      String message,
                      String className,
                      String traceId,
                      String spanId) {

        this.logLevel = level;
        this.message = message;
        this.timestamp = System.currentTimeMillis();
        this.threadName = Thread.currentThread().getName();
        this.className = className;
        this.traceId = traceId;
        this.spanId = spanId;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public String getMessage() {
        return message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getThreadName() {
        return threadName;
    }

    public String getClassName() {
        return className;
    }

    public String getTraceId() {
        return traceId;
    }

    public String getSpanId() {
        return spanId;
    }
}
