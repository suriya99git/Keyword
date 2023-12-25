package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advance_Select {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='small-searchterms'])[1]")).sendKeys("Custom T-Shirt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='As']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='10']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Pf']")).sendKeys("8.0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Pt']")).sendKeys("20.0");
		
		driver.findElement(By.xpath("//input[@id='Sid']")).click();
		
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
	}
}
