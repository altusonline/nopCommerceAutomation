package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NopcommerceWithTestngReport {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		Reporter.log("open firefox browser");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Reporter.log("maximize window");
		driver.manage().window().maximize();
		Reporter.log("navigating to nopcommerce website");
		driver.get("https://demo.nopcommerce.com/");	
	}
	
	@Test
	public void logoTest() {
		Reporter.log("verifying the logo");
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed());
	}
	
	@AfterMethod
	public void tearDown() {
		Reporter.log("closing the browser");
		driver.quit();
	}
	

}
