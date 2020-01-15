package paralleltest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RunMethods {
	
	@BeforeMethod
	public void setUp() {
		System.out.println("this is before method setup");
	}
	
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	@Test
	public void test3() {
		System.out.println("test3");
	}
	
	
	@AfterMethod
	public void tearDown() {
		System.out.println("this is after method tear  down");
	}

}
