package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.TestUtil;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}
	
	@Test(dataProvider = "login")
	public void login(String id, String pass) {
		driver.findElement(By.id("email")).sendKeys(id);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.id("u_0_2")).click();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	@DataProvider(name="login")
	public Object[][] getData() {
		Object[][] data = TestUtil.getTestData("login");
		return data;
	}
	

}
