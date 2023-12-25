package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_contains {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		driver.findElement(By.xpath("(//input[contains(@class,'search')])[1]")).sendKeys("books");
		driver.findElement(By.xpath("(//input[contains(@class,'search')])[2]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		driver.findElement(By.xpath("(//a[contains(@class,'ico')])[2]")).click();
		driver.findElement(By.xpath("(//a[contains(@class,'ico')])[3]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		driver.findElement(By.xpath("(//input[contains(@value,'M')])[2]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'First')]")).sendKeys("suriya");
		driver.findElement(By.xpath("//input[contains(@name,'Last')]")).sendKeys("Johnson");
		driver.findElement(By.xpath("(//input[contains(@class,'text')])[4]")).sendKeys("john@gmail.com");
		
		
		
	}
}
