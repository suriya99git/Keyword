package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://shoppersstack.com/user-signin");
		
		driver.findElement(By.id("Email")).sendKeys("Suriya");
	}
}
