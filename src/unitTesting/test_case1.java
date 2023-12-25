package unitTesting;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test_case1 {

	@Test(priority = 2,invocationCount = 2,threadPoolSize = 2)
	public void start() {
		Reporter.log("from start",true);
		//int a = 1/0;
	}
	@Test(priority = 1,dependsOnMethods  = "start",timeOut = 2000)
	public void run() {
		Reporter.log("from run",true);
	}
	@Test(priority = 0,enabled = false)
	public void stop() {
		Reporter.log("from stop",true);
	}
}
