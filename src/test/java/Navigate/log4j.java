package Navigate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class log4j {
	
Logger logger = LogManager.getLogger(log4j.class);
	
	@Test
	public void method1()
	{
		System.out.println("this is method1");
		
		logger.trace(" This is trace method");
		
		logger.info(" this is information message");
		
		logger.error(" this is an error message");
		
		logger.fatal(" this is a fatal message");
		
		logger.warn(" this is a warning message");
		
		System.out.println("this is end of method1");
	}
}
