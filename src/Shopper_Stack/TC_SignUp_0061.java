package Shopper_Stack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_SignUp_0061 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://shoppersstack.com/");
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Create Account')]")).click();
	boolean Phone_Number	= driver.findElement(By.xpath("//input[@id='Phone Number']")).isEnabled();
	
	if (Phone_Number) {
		System.out.println("Phone Number text field is enabled");
		
	}
	
	else {
		System.out.println(" Phone Number text field is not enabled");
	}
	
	driver.quit();
	}
}
