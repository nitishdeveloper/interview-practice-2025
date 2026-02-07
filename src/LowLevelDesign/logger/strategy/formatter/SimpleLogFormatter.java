package LowLevelDesign.logger.strategy.formatter;

import LowLevelDesign.logger.LogMessage;
import LowLevelDesign.logger.strategy.LogFormatter;

import java.time.Instant;

public class SimpleLogFormatter implements LogFormatter {

    @Override
    public String format(LogMessage msg) {
        return String.format(
                "%s [%s] [%s] %s traceId=%s spanId=%s - %s",
                Instant.ofEpochMilli(msg.getTimestamp()),
                msg.getThreadName(),
                msg.getLogLevel(),
                msg.getClassName(),
                msg.getTraceId(),
                msg.getSpanId(),
                msg.getMessage()
        );
    }
}
