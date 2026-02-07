package LowLevelDesign.logger.strategy.appender;

import java.io.File;

public class RollingFileAppender extends FileAppender {

    private final long maxFileSize;
    private long currentSize;

    public RollingFileAppender(String filePath, long maxFileSize) {
        super(filePath);
        this.maxFileSize = maxFileSize;
        this.currentSize = new File(filePath).exists() ? new File(filePath).length() : 0;
    }

    @Override
    public synchronized void append(String msg) {
        if (currentSize + msg.length() >= maxFileSize) {
            roll();
        }
        super.append(msg);
        currentSize += msg.length();
    }

    private void roll() {
        close();
        File file = new File(filePath);
        file.renameTo(new File(filePath + "." + System.currentTimeMillis()));
        open();
        currentSize = 0;
    }
}
