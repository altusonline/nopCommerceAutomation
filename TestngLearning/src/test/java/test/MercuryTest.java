package test;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class MercuryTest {
	public WebDriver driver;
	public Logger logger = Logger.getLogger("devpinotLogger");
	
	

	@BeforeMethod
	public void setup() {
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

	@Test
	public void tileVerification() {
		logger.debug("getting page title");
		String title = driver.getTitle();
		if(title.equals("Welcome: Mercury Tours")) {
			logger.debug("printing message if title is correct");
			System.out.println("title is correct");
		}else {
			System.out.println("title is wrong");
		}
	}
	
	@Test
	public void verifyLogin() {
		logger.debug("type user name");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		logger.debug("type password");
		driver.findElement(By.name("password")).sendKeys("mercury");
		logger.debug("click on login button");
		driver.findElement(By.name("login")).click();
		logger.debug("waiting until singin");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(.,'SIGN-OFF')]"))));
		logger.debug("click on sign off button");
		driver.findElement(By.xpath("//a[contains(.,'SIGN-OFF')]")).click();
	}
	
	@Test
	public void verifySearchFlight() throws Exception {
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(.,'SIGN-OFF')]"))));
		driver.findElement(By.name("findFlights")).click();
		Thread.sleep(3000);		
	}
	

	@AfterMethod
	public void tearDown() {
		logger.info("close the browser");
		driver.close();
	}

}
