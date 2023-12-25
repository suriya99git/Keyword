package GroupExecutionShoe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class addidas {

	@Test(groups = "smoke")
	public static void openAddidas() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.adidas.co.in/");
		driver.close();
	}
}
