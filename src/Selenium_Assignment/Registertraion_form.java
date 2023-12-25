package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registertraion_form {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.className("ico-register")).click();
		
		driver.findElement(By.name("Gender")).click();
		
		driver.findElement(By.name("FirstName")).sendKeys("suriya");
		
		driver.findElement(By.name("LastName")).sendKeys("johnson");
		
		driver.findElement(By.name("Email")).sendKeys("suriya@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("Suriya");
		
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Suriya");
		
		driver.findElement(By.id("register-button")).click();
		
	}
}
