package com.gollahalli;

import java.nio.file.Path;
import java.nio.file.Paths;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Akshay Raj Gollahalli
 */
public class UsingLog4JSLF4J {
    
    static {
        // Getting the current path of this folder.
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        
        // adding the location to the log file, if the log file is not already present
        // a log file with LOG4JSL4J.log is created
        System.setProperty("LOG4JSL4J", s + "/LOG4JSL4J.log");
        // Location of the log4j config file
        System.setProperty("log4j.configurationFile", "com/gollahalli/log4j-configFile.xml");        
    }
    
    // Initialising the logger class.
    public static final Logger LOGGER = LoggerFactory.getLogger(UsingLog4JSLF4J.class);
    
    public static void main(String[] args) {
        LOGGER.error("This is an error");
        LOGGER.info("this is info log");
        LOGGER.debug("A debug messaage, works only in debug mode");
        System.out.println("class name is " + LOGGER.getName());
        LOGGER.warn("warning");
        
        try {
            int a=10;
            int b=0;
            System.out.println(a/b);
        } catch (Exception e) {
            LOGGER.error("An integer cannot be divisible by 0.", e);
        }
        
        }
    
}
