package GroupExecutionWatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fastTrack {

	@Test(groups = "smoke")
	public static void openFasttrack() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fastrack.in/");
		driver.close();
	}
}
