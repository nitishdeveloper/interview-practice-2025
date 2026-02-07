package LowLevelDesign.logger.strategy.appender;

import LowLevelDesign.logger.strategy.LogAppender;

import java.io.*;
import java.nio.file.*;

public class FileAppender implements LogAppender {

    protected final String filePath;
    protected BufferedWriter writer;

    public FileAppender(String filePath) {
        this.filePath = filePath;
        open();
    }

    protected void open() {
        try {
            writer = Files.newBufferedWriter(
                    Paths.get(filePath),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected void close() {
        try {
            writer.close();
        } catch (Exception ignored) {
        }
    }

    @Override
    public synchronized void append(String msg) {
        try {
            writer.write(msg);
            writer.newLine();
            writer.flush();
        } catch (IOException ignored) {
        }
    }
}
