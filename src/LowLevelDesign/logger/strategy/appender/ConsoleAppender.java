package LowLevelDesign.logger.strategy.appender;

import LowLevelDesign.logger.strategy.LogAppender;

public class ConsoleAppender implements LogAppender {
    @Override
    public void append(String log) {
        System.out.println(log);
    }
}
