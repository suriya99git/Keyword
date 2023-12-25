package GroupExecutionWatch;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fireBoult {


	@Test
	public  void openFireboult() {
	 WebDriver   driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fireboltt.com/");
		driver.close();
	}
	
}
