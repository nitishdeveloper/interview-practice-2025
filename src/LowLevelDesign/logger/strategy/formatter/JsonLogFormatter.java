package LowLevelDesign.logger.strategy.formatter;

import LowLevelDesign.logger.LogMessage;
import LowLevelDesign.logger.strategy.LogFormatter;

import java.time.Instant;

public class JsonLogFormatter implements LogFormatter {

    @Override
    public String format(LogMessage msg) {
        return "{" +
                "\"timestamp\":" + msg.getTimestamp() + "," +
                "\"timestampIso\":\"" +
                Instant.ofEpochMilli(msg.getTimestamp()) + "\"," +
                "\"level\":\"" + msg.getLogLevel() + "\"," +
                "\"thread\":\"" + msg.getThreadName() + "\"," +
                "\"class\":\"" + msg.getClassName() + "\"," +
                "\"traceId\":\"" + msg.getTraceId() + "\"," +
                "\"spanId\":\"" + msg.getSpanId() + "\"," +
                "\"message\":\"" + escape(msg.getMessage()) + "\"" +
                "}";
    }

    private String escape(String msg) {
        return msg.replace("\"", "\\\"");
    }
}
