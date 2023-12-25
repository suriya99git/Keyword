package Shopper_Stack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_SignUp_004 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://shoppersstack.com/");
		
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		
		driver.findElement(By.xpath("//a[@id='signIn']")).click();
		
	boolean signin	= driver.findElement(By.xpath("//h5[contains(@class,'MuiTypography-root')]/child::strong")).isDisplayed();
	
	if (signin) {
		
		System.out.println("  Shoppers login page is displayed.");
	}
	else {
		System.out.println("Shoppers login page is not displayed.");
	}
	}
}
