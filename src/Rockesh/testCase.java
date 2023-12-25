package Rockesh;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testCase extends BaseTest {

	@Test
	public void test1() {
		Reporter.log("haii",true);
	}
	
	@Test
	public void test2() {
		Reporter.log("bye",true);
	}
}

