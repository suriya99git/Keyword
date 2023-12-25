package Selenium_Assignment;

import java.util.List;

import javax.sound.sampled.LineListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Findelements1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		
	
		for (WebElement webElement : link) {
			
			System.out.println(webElement.getAttribute("href")+"---> "+ webElement.getText());
		}
		
	}
}
