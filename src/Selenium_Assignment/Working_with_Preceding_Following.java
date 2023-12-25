package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Preceding_Following {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/suriy/Downloads/xpath.html");
		
		driver.findElement(By.xpath("(//input)[1]/following-sibling::input/following-sibling::button/preceding-sibling::input[1]")).sendKeys("suriya");
	}
}
