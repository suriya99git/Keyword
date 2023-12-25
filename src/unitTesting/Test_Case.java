package unitTesting;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Case {

	@Test(groups = "smoke")
	public void name() {
		Reporter.log("suriya",true);
		name1();
	}
	@Test
	public  void name1() {
		Reporter.log("johnson",true);
	}

	@Test(groups = "smoke")
	public void name2() {
		Reporter.log("Suriya johnson",true);
	}
}
