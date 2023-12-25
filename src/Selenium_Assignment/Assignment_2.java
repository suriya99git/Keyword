package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium webdriver\\\\Selenium\\\\Driver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/");

		//click on register
		driver.findElement(By.linkText("Register")).click();
		//click on log
		driver.findElement(By.partialLinkText("Log")).click();
		// click on shopping
		driver.findElement(By.partialLinkText("Shopping")).click();
		//click on list
		driver.findElement(By.partialLinkText("list")).click();
		//click on register
		for(int i=0;i<3;i++) {
			driver.navigate().back();
		}
		//find the search field and enter text
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
	}
}
