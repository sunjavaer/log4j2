package lvliang;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    private App() {}

    public static void main(String[] args) {
        logger.debug("debug");
        logger.info("info");

        try {
            Integer a = 9, b = 0;
            Integer c = a / b;
        } catch (Exception e) {
            logger.error("除数为零", e.getMessage(), e);
        }
    }
}
