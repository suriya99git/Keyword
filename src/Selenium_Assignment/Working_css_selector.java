package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_css_selector {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/books");
		driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("Phone Cover");
		driver.findElement(By.cssSelector("input[class='button-1 search-box-button']")).click();
		driver.findElement(By.cssSelector("img[alt='Picture of Phone Cover']")).click();
		driver.findElement(By.cssSelector("input[id='add-to-cart-button-80']")).click();
		driver.findElement(By.cssSelector("span[class='cart-label']")).click();
		driver.findElement(By.cssSelector("input[name='termsofservice']")).click();
		driver.findElement(By.cssSelector("button[id='checkout']")).click();
		
	}
}
