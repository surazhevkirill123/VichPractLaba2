package by.bsu.prj.Controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2 {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        logger.info("Im started.");
        logger.warn("Something to warn");
        logger.error("Something failed.");

    }
}
