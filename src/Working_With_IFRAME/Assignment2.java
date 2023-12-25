package Working_With_IFRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
	//	System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/suriy/Downloads/iframe.html");
		
		driver.switchTo().frame("frame1");
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
	}
}
