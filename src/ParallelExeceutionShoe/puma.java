package ParallelExeceutionShoe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class puma {

	@Test
	public static void openPuma(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/");
		driver.close();
	}
}
