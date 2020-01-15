package validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
	}
	
	@Test
	public void valiatePageTitle() {
		String ExpectedTitle = "demo store";
		String ActualTitle = driver.getTitle();
		System.out.println("vefiry title");
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("verify logo");
		WebElement logo = driver.findElement(By.xpath("//img[contains(@alt,'nopCommerce demo store')]"));
		Assert.assertTrue(logo.isDisplayed());

	}
	
	@Test
	public void loginTest() {
		String ExpectedTitle = "demo store";
		String ActualTitle = driver.getTitle();
		System.out.println("vefiry title");
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("verify logo");
		WebElement logo = driver.findElement(By.xpath("//img[contains(@alt,'nopCommerce demo store')]"));
		softassert.assertTrue(logo.isDisplayed());
		softassert.assertAll();

	}
	
	
	/*
	 * @Test public void validateLogo() { WebElement logo =
	 * driver.findElement(By.xpath("//img[contains(@alt,'nopCommerce demo store')]")
	 * ); Assert.assertTrue(logo.isDisplayed());
	 * 
	 * }
	 */
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
