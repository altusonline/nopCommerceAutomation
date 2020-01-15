package listnerstest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value=testnglistners.Listener.class)
public class TestLogin {
	
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
		Assert.fail();
		
	}
	
	@Test
	public void test3() {
		System.out.println("test3");
	}
	
	@Test
	public void test4() {
		System.out.println("test4");
	}

}
