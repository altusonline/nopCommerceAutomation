package attributes;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(enabled = true)
	public void placeOrder(){
		System.out.println("order placed");
	}
	
	@Test
	public void placeOrder2(){
		System.out.println("order placed 2");
	}
	
	@Test
	public void placeOrder3(){
		System.out.println("order placed 3");
	}

}
