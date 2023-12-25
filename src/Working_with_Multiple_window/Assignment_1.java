package Working_with_Multiple_window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {


	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		for (String s : windows) {
			driver.switchTo().window(s);
			
			if (!(driver.getTitle().equalsIgnoreCase("Demo Web Shop"))) {
				driver.close();
			}
		}
		
	}
}
