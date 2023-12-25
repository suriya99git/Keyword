package Yogita;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener {

	
	@Override
	public void onFinish(ITestContext context) {
	
		System.out.println("Test Execution Finished");
	}
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Execution Start");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Execution Failed");
		
	}
	
}
