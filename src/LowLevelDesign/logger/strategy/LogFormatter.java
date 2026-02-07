package LowLevelDesign.logger.strategy;

import LowLevelDesign.logger.LogMessage;

public interface LogFormatter {
    String format(LogMessage message);
}
