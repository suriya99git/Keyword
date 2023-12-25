package Shopper_Stack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_SignUp_0043 {


	public static void main(String[] args) {
		
		String name = "suri";
		
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://shoppersstack.com/");
		
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		
		driver.findElement(By.xpath("//input[@id='Last Name']")).sendKeys(name);
		if(name.length()>3) {
			try {
				driver.findElement(By.xpath("//p[contains(text(),'Must have at least 3 and less than 20 characters')]"));
			} catch (Exception e) {
				System.out.println("it accepting");
			}
			
		}
		else {
		String	Invalid_Input = driver.findElement(By.xpath("//p[contains(text(),'Must have at least 3 and less than 20 characters')]")).getText();
		System.out.println(Invalid_Input);
		}
		driver.quit();
		}
	
}
