package LowLevelDesign.logger;

import java.util.UUID;

public class TraceContext {

    private static final ThreadLocal<String> traceId =
            ThreadLocal.withInitial(() -> UUID.randomUUID().toString());

    private static final ThreadLocal<String> spanId =
            ThreadLocal.withInitial(() -> UUID.randomUUID().toString());

    public static String getTraceId() {
        return traceId.get();
    }

    public static String getSpanId() {
        return spanId.get();
    }

    public static void newSpan() {
        spanId.set(UUID.randomUUID().toString());
    }

    public static void clear() {
        traceId.remove();
        spanId.remove();
    }
}
