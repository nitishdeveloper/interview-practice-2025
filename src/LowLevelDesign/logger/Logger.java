package LowLevelDesign.logger;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

public class Logger {

    private static final ConcurrentHashMap<String, Logger> REGISTRY =
            new ConcurrentHashMap<>();

    private final String className;
    private final LogDispatcher dispatcher;
    private final AtomicReference<LogLevel> level =
            new AtomicReference<>(LogLevel.INFO);

    private Logger(String className, LogDispatcher dispatcher) {
        this.className = className;
        this.dispatcher = dispatcher;
    }

    public static Logger getLogger(Class<?> c, LogDispatcher d) {
        return REGISTRY.computeIfAbsent(
                c.getName(), n -> new Logger(n, d));
    }

    public void log(LogLevel l, String msg) {
        if (l.priority() >= level.get().priority()) {
            dispatcher.publish(new LogMessage(
                    l, msg, className,
                    TraceContext.getTraceId(),
                    TraceContext.getSpanId()));
        }
    }

    public void info(String m) { log(LogLevel.INFO, m); }
    public void debug(String m) { log(LogLevel.DEBUG, m); }
    public void warn(String m) { log(LogLevel.WARN, m); }
    public void error(String m) { log(LogLevel.ERROR, m); }
}
