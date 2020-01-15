package log4j;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogTest {
	
	public WebDriver driver;
	public Logger logger = Logger.getLogger("devpinotLogger");
	
	
	@BeforeMethod
	public void setUp() {
		PropertyConfigurator.configure("C:\\Users\\Elshat\\Documents\\eclipse-workspace\\TestngLearning\\src\\test\\resources\\property\\log4j.properties");
		logger.debug("Starting test, initiating driver");
		WebDriverManager.firefoxdriver().setup();
		logger.debug("opening chrome browser");
		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		logger.debug("maximize browser");
		driver.manage().window().maximize();
		logger.debug("navigating to the application");
		driver.get("http://newtours.demoaut.com/");	
	}

}
