package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class p3 {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/suriy/Downloads/iframe.html");
			
			driver.switchTo().frame("frame2");
			
			driver.findElement(By.cssSelector(".img-fluid.hd-sos-icon"));
			
			Actions actions  = new Actions(driver);
			
			actions.moveToElement(driver.findElement(By.xpath("(//img[contains(@class,'img-fluid hd-sos-icon')])[2]"))).click().perform();
			 String parent = driver.getWindowHandle();
		
			 Set<String> window = driver.getWindowHandles();
			 
			 for (String s : window) {
				
				 if (!(driver.getWindowHandle().contains(parent))) {
					
					driver.findElement(By.xpath("//span[contains(text(),'Replies')]")).click();
					
				}
			}
			 
			 driver.switchTo().defaultContent();
	}
}
