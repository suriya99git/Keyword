package Shopper_Stack;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_SignUp_0017 {


	public static void main(String[] args) {
		
		String name = "su";
		
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://shoppersstack.com/");
		
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		
		driver.findElement(By.xpath("//input[@id='First Name']")).sendKeys(name);
		if(name.length()>2) {
			System.out.println("It is  Accepting");
			
		}
		else {
			System.err.println(	driver.findElement(By.xpath("//p[contains(text(),'Must have at least 3 and less than 20 characters')]")).getText());		}
	}	
}
