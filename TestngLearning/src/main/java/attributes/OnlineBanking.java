package attributes;

import org.testng.annotations.Test;

public class OnlineBanking {
	
	
	@Test(priority = 0)
	public void userLogin() {
		int a = 5/0;
		System.out.println("user login completed");
		
	}
	
	
	@Test(priority = 1,dependsOnMethods = "userLogin")
	public void sendMoney() {
		System.out.println("Money send");
	}
	
	
	@Test(priority = 2,dependsOnMethods = "sendMoney")
	public void bankStatement() {
		System.out.println("statement download");
	}
	
	
	@Test(priority = 3,dependsOnMethods = "bankStatement")
	public void logout() {
		System.out.println("logout completed");
	}
	

}
