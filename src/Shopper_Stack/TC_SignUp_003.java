package Shopper_Stack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_SignUp_003 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://shoppersstack.com/");
		
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Create Account')]")).click();
		
	boolean Create_Account =	driver.findElement(By.xpath("//div[@class='signup_formCard__LwNTE']/h1")).isDisplayed();
	
	if (Create_Account) {
		
		System.out.println("signup page is displayed");
	}
	else {
		System.out.println("signup page is not displayed");
	}
	}
}
