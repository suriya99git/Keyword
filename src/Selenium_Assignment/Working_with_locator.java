package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_locator {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		//Step-1 : Launching the chromedriver
		WebDriver driver = new ChromeDriver();
		//step 2 : Enter the url
		driver.get("https://demowebshop.tricentis.com/");
		

		//	driver.findElement(By.name("q")).sendKeys("mobiles");
		//step 3: Find the element by using locator and enter the text field by using method
		//		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");

		driver.quit();

	}
}
