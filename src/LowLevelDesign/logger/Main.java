package LowLevelDesign.logger;


public class Main {
    private static final Logger logger = LowLevelDesign.logger.LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("Application started");

        TraceContext.newSpan();
        logger.debug("Processing request");

        TraceContext.newSpan();
        logger.error("Something went wrong");

        TraceContext.clear();
    }
}
