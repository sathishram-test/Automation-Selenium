package Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class logClass 
{

private static	Logger logger=LogManager.getLogger(logClass.class);
	
	
	public static void main(String[] args)
	{
		
		System.out.println("The log file create");
		
		logger.info("Information message");
		logger.error("Error message");
		logger.warn("waring mesage");
		logger.fatal("Fatal mesage");
		
		System.out.println("The end of log file");
		
	}
}
