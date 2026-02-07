package LowLevelDesign.logger;

import LowLevelDesign.logger.strategy.LogAppender;
import LowLevelDesign.logger.strategy.LogFormatter;

import java.util.List;
import java.util.concurrent.*;

public class LogDispatcher {

    private static volatile LogDispatcher INSTANCE;
    private final BlockingQueue<LogMessage> queue = new ArrayBlockingQueue<>(10_000);
    private final ExecutorService worker = Executors.newSingleThreadExecutor();
    private final LogFormatter formatter;
    private final List<LogAppender> appenders;
    private volatile boolean running = true;

    private LogDispatcher(LogFormatter formatter, List<LogAppender> appenders) {
        this.formatter = formatter;
        this.appenders = appenders;
        start();
    }

    public static LogDispatcher getInstance(LogFormatter f, List<LogAppender> a) {
        if (INSTANCE == null) {
            synchronized (LogDispatcher.class) {
                if (INSTANCE == null)
                    INSTANCE = new LogDispatcher(f, a);
            }
        }
        return INSTANCE;
    }

    public void publish(LogMessage msg) {
        if (!queue.offer(msg)) {
            write(msg);
        }
    }

    private void start() {
        worker.submit(() -> {
            while (running || !queue.isEmpty()) {
                LogMessage msg = null;
                try {
                    msg = queue.poll(1, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (msg != null) write(msg);
            }
        });
    }

    private void write(LogMessage msg) {
        String formatted = formatter.format(msg);
        for (LogAppender a : appenders) a.append(formatted);
    }

    public void shutdown() {
        running = false;
        worker.shutdown();
    }
}
