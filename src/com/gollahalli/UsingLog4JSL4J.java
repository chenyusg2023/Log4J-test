package com.gollahalli;

import java.nio.file.Path;
import java.nio.file.Paths;
//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Akshay Raj Gollahalli
 */
public class UsingLog4JSL4J {
    
    static {
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        
        // adding the location to the log file, if the log file is not already present
        // a log file with LOG4JSL4J.log is created
        System.setProperty("LOG4JSL4J", s + "/LOG4JSL4J.log");
        // Location of the log4j config file
        System.setProperty("log4j.configurationFile", "com/gollahalli/log4j-configFile.xml");        
    }
    
//    public static final Logger logger = LogManager.getLogger(UsingLog4JSL4J.class);
    public static final Logger logger = LoggerFactory.getLogger(UsingLog4JSL4J.class);
    
    public static void main(String[] args) {
        logger.error("This is an error");
        logger.info("this is info log");
        logger.debug("A debug messaage, works only in debug mode");
//        logger.fatal("fatal message");
        System.out.println("class name is " + logger.getName());
        logger.warn("warning");
//        logger.log(Level.INFO, "Another way to log Info errors");
        
        try {
            int a=10;
            int b=0;
            System.out.println(a/b);
        } catch (Exception e) {
//            logger.catching(e);
            logger.error("An integer cannot be divisible by 0.", e);
        }
        
        }
    
}
