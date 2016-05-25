/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gollahalli;

import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 *
 * @author akshayrajgollahalli
 */
public class UsingLog4JSL4J {
    
//    static String getUserAppDirectory() {
//        String osName = System.getProperty("os.name");
//        if (osName.contains("Mac")) {
//            return System.getProperty("user.home") + "/.JCal/logs/JCal-log.log";
//        }
//        else {
//            return System.getProperty("user.home") + "/.JCal/logs/JCal-log.log";
//        }
//    }
    
    static {
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        System.setProperty("LOG4JSL4J", s + "/LOG4JSL4J.log");
        System.setProperty("log4j.configurationFile", "com/gollahalli/log4j-configFile.xml");        
    }
    
    public static final Logger logger = LogManager.getLogger(UsingLog4JSL4J.class);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        logger.error("This is an error");
        logger.info("this is info log");
        logger.debug("A debug messaage, works only in debug mode");
        logger.fatal("fatal message");
        System.out.println("class name" + logger.getName());
        logger.warn("warning");
        logger.log(Level.INFO, "Another way to log Info errors");
        
        try {
            int a=10;
            int b=0;
            System.out.println(a/b);
        } catch (Exception e) {
            logger.catching(e);
        }
        
        }
    
}
