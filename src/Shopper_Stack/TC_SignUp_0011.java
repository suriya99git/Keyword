package Shopper_Stack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_SignUp_0011 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://shoppersstack.com/");

		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();

		driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]")).click();

		String text =	driver.findElement(By.xpath("//label[@id='First Name-label']")).getText();
		
		if (text.contains("First Name")) {
			System.out.println("First Name text field contains a placeholder stating First Name .");
		}
		else {
			System.out.println("First Name text field Not contains a placeholder stating First Name .");
		}
	

	   
		
	}
}
