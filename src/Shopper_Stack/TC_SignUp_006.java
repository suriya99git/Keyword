package Shopper_Stack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_SignUp_006 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://shoppersstack.com/");
		
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		
		driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]")).click();
		
		boolean signin = driver.findElement(By.xpath("//a[@id='signIn']")).isEnabled();
		if (signin) {
			System.out.println("Sign In is enabled.");
		}
		else {
			System.out.println("Sign In is Not enabled.");
		}
		
	}
}
