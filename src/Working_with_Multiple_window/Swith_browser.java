package Working_with_Multiple_window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swith_browser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/suriy/Downloads/MultipleWindow.html");
		
		 String parent_window = driver.getWindowHandle();
		 
		 System.out.println(parent_window);
		 
		 
		 driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		 
		 Thread.sleep(2000);
		 //identify all the new window opened
		 Set<String> child_window = driver.getWindowHandles();
		 
		 System.out.println(child_window);
		 
		 //to close one by one browser
		 for (String window : child_window) {
			driver.switchTo().window(window);
			if (!(driver.getTitle().equalsIgnoreCase("Multiple popups"))) {
				driver.close();
			}
		}
		 
		 
	}
}
