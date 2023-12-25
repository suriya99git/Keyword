package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input")).sendKeys("mobile");
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
	}
}
