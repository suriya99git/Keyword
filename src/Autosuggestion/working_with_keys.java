package Autosuggestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_keys {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("comp");
		
		driver.findElement(By.xpath("(//a[contains(text(),'Build your own computer')])[1]")).sendKeys(Keys.ENTER);
	}
}
