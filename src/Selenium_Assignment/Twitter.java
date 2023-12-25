package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://twitter.com/");
		
		driver.findElement(By.linkText("Create account")).click();
		
		driver.findElement(By.name("name"));
		
		
		
		
		
		
	}
}
