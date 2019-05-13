import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Akshay Raj Gollahalli
 */
public class UsingLog4JSLF4J {

    // Initialising the logger class.
    private static final Logger LOGGER = LoggerFactory.getLogger(UsingLog4JSLF4J.class);

    public static void main(String[] args) {
        LOGGER.error("This is an error");
        LOGGER.info("this is info log");
        LOGGER.debug("A debug messaage, works only in debug mode");
        System.out.println("class name is " + LOGGER.getName());
        LOGGER.warn("warning");

        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (Exception e) {
            LOGGER.error("An integer cannot be divisible by 0.", e);
        }

    }

}
