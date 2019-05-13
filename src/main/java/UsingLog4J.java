import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * @author Akshay Raj Gollahalli
 */
public class UsingLog4J {

    // Initialising the logger class.
    private static final Logger LOGGER = LogManager.getLogger(UsingLog4J.class);

    public static void main(String[] args) {
        LOGGER.error("This is an error");
        LOGGER.info("this is info log");
        LOGGER.debug("A debug messaage, works only in debug mode");
        LOGGER.fatal("fatal message");
        System.out.println("class name is " + LOGGER.getName());
        LOGGER.warn("warning");
        LOGGER.log(Level.INFO, "Another way to log Info errors");

        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (Exception e) {
            LOGGER.catching(e);
        }

    }

}
