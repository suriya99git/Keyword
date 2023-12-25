package Selenium_Assignment;

import java.util.List;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Findelements2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/suriy/Downloads/demo.html");
		
	List<WebElement> name = driver.findElements(By.xpath("//input[@name='fname']"));
	
	
	
	for (WebElement webElement : name) {
		
		webElement.sendKeys("Suriya");
		Thread.sleep(1000);
	}
	}
}
