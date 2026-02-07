package LowLevelDesign.logger;

import LowLevelDesign.logger.strategy.appender.*;
import LowLevelDesign.logger.strategy.formatter.JsonLogFormatter;

import java.util.List;

public final class LoggerFactory {

    private static final LogDispatcher dispatcher =
            LogDispatcher.getInstance(
                    new JsonLogFormatter(),
                    List.of(
                            new ConsoleAppender(),
                            new RollingFileAppender("app.log", 5_000_000)
                    )
            );

    private LoggerFactory() {}

    public static Logger getLogger(Class<?> clazz) {
        return Logger.getLogger(clazz, dispatcher);
    }
}
