package GroupExecutionWatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sonata {

	@Test(groups = "smoke")
	public void openSonata()  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sonatawatches.in/");
		driver.close();
	}
}
