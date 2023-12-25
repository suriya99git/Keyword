package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_form_using_css {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.cssSelector("a[class='ico-register']")).click();
		
		driver.findElement(By.cssSelector("input[id='gender-male']")).click();
		
		driver.findElement(By.cssSelector("input[name='FirstName']")).sendKeys("harsha");
		
		driver.findElement(By.cssSelector("input[name='LastName']")).sendKeys("vardhan");
		
		driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("harshaVardhan@gmail.com");
		
		driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("Suriya");
		
		driver.findElement(By.cssSelector("input[name='ConfirmPassword']")).sendKeys("Suriya");
		
		driver.findElement(By.cssSelector("input[name ='register-button']")).click();
		
		
	}
}
