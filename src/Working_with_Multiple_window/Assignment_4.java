package Working_with_Multiple_window;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_4 {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

	
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/suriy/Downloads/MultipleWindow.html");

		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		 Thread.sleep(2000);
		
		 Set<String> allwindow = driver.getWindowHandles();
		
		 for (String s: allwindow) {
			
			 driver.switchTo().window(s);
			 Thread.sleep(2000);
			 if (driver.getTitle().contains("Olive Garden Italian Restaurant")) {
				driver.close();
			}
		}
	}
}
