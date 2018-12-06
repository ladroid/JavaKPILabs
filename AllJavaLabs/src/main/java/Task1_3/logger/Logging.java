package Task1_3.logger;

import Task1_3.Task1_3;
import Task1_3.controller.Controller;
import org.apache.log4j.*;

@Deprecated
public class Logging {
    private final Logger logger = Logger.getLogger(Task1_3.class);
    public void logging() {
        //Logger logger = Logger.getLogger(Task1_3.class);
        System.out.println(System.getProperty("java.util.logging.config.file"));
        logger.info("This is my first log4j's statement");
        logger.log(Level.INFO, "info");
        logger.log(Level.ERROR, "error");
    }
}
