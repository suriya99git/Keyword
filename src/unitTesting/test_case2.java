package unitTesting;

import org.testng.annotations.Test;

public class test_case2 {

	@Test(priority = 2)
	public void deleteAccount() {
		System.out.println("Account is deleted");
	}
	@Test(priority = 1,enabled = false)
	public void modifyAccount() {
		System.out.println("Account is modified");
	}
	@Test(invocationCount = 2,threadPoolSize = 2)
	public void createAccount() {
		System.out.println("Account is created");
	}
}
