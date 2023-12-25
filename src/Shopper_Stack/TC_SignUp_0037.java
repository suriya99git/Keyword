package Shopper_Stack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC_SignUp_0037 {


public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://shoppersstack.com/");
		
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		
		String  text = driver.findElement(By.xpath("//label[@id='Last Name-label']/child::span")).getText();
		
		if (text.contains("*")) {
			System.out.println("Last Name Text Field Is Mandatory");
		}
		
		else {
			System.out.println("Last Name Text Field Is Not Mandatory");
		}
		
}
}
