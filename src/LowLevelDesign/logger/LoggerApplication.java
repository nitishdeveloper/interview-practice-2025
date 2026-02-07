package LowLevelDesign.logger;


public class LoggerApplication {
    private static final Logger logger = LowLevelDesign.logger.LoggerFactory.getLogger(LoggerApplication.class);

    public static void main(String[] args) {

        logger.info("Application started");
        logger.debug("Processing request");
        logger.error("Something went wrong");
        TraceContext.clear();
    }
}
