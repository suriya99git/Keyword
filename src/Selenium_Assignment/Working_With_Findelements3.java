package Selenium_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Findelements3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/suriy/Downloads/demo.html");
		
	List<WebElement> name = driver.findElements(By.xpath("//input[@name='download']"));
	
	for (WebElement Element : name) {
		
		Element.click();
		
	}
	}
}
