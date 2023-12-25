package seleeniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_browser {

	public static void main(String[] args) throws InterruptedException {
	//set the path of the chromedriver executable
		System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
	//create a new instance for chromedriver	
		ChromeDriver driver = new ChromeDriver();
	//Open a webpage
		driver.get("https://www.example.com");
	//using id locator
		driver.findElement(By.id("Username"));
	//using name locator	
		driver.findElement(By.name("q"));
	//using linktext locator	
		driver.findElement(By.linkText("Userfield"));
	//using partial link text locator
		driver.findElement(By.partialLinkText("User"));
	//using tagname locator	
		driver.findElement(By.tagName("input"));
			Options aOptions;
			driver.manage().window().maximize();

	}
}
