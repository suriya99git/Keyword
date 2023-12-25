package Shopper_Stack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_SignUp_0010{

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://shoppersstack.com/");
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]")).click();
		boolean Register_Button = driver.findElement(By.xpath("//button[@id='Register']")).isEnabled();
		String text	= driver.findElement(By.xpath("//label[@id='First Name-label']/child::span")).getText();

		if (text.contains("*")) {
			System.out.println("First name text field contains asterisk symbol");
		}
		else {
			System.out.println("First Name text field Doest Not Contains asterisk symbol.");
		}

	}
}
