package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;





public class LogTest {
	
	private static Logger logger = Logger.getLogger(LogTest.class);
	public static void main(String[] args) throws IOException, IOException {
		
		Properties props = new Properties();
		props.load(new FileInputStream("C:\\Users\\Elshat\\Documents\\eclipse-workspace\\TestngLearning\\src\\test\\resources\\property\\log4j.properties"));
		PropertyConfigurator.configure(props);
		
		logger.debug("logget test");
		logger.info("logget test");
		logger.info("logget test");
		logger.info("logget test");
		logger.info("logget test");
	}

}
