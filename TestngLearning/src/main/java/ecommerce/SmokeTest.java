package ecommerce;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SmokeTest {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
	}
	
	
	@Test(priority = 1)
	public void verfiryTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "nopCommerce demo store");
	}
	
	@Test(priority = 2)
	public void verifyLogo() {
		WebElement logo = driver.findElement(By.xpath("//img[contains(@alt,'nopCommerce demo store')]"));
		Assert.assertTrue(logo.isDisplayed());
	}
	
	
	@Test(priority = 3)
	public void userLogin() throws Exception {
		driver.findElement(By.xpath("//a[contains(.,'Log in')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("altus@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Test1234");
		driver.findElement(By.xpath("//input[contains(@value,'Log in')]")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//a[@href='/logout']"));
		Assert.assertTrue(element.isDisplayed());
		element.click();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
