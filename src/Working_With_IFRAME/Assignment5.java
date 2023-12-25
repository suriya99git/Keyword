package Working_With_IFRAME;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/suriy/Downloads/iframe.html");

		driver.switchTo().frame("frame1");

		driver.findElement(By.xpath("//a[text()='Log in']")).click();

		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//a[text()='Google']")).click();

		driver.switchTo().frame("callout");

		driver.findElement(By.xpath("//button[contains(text(),'Stay signed out')]")).click();

		driver.quit();
	}
}
