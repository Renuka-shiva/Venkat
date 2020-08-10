package log4jexample;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

 
public class HtmlLayoutEx {
	 private static final Logger logger = LogManager.getLogger(HtmlLayoutEx.class);  
	 public static void main(String[] args) {  
	  // basic log4j configurator  
	  BasicConfigurator.configure();  
	  logger.info("Hello world");  
	  logger.info("we are in logger info mode");  
	  logger.trace("Trace Message!");  
      logger.debug("Debug Message!");  
      logger.info("Info Message!");  
      logger.warn("Warn Message!");  
      logger.error("Error Message!");  
      logger.fatal("Fatal Message!");  
	 }

}
