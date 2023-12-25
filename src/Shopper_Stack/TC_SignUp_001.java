package Shopper_Stack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_SignUp_001 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://shoppersstack.com/");


		boolean Web_Page	= driver.findElement(By.xpath("//h3[text()='Welcome to ShoppersStack. Enjoy shopping with us.']")).isDisplayed();

		if (Web_Page) {

			System.out.println("Shopper_Stack is opened succesfully");
		}

		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();

		boolean login_Page	= driver.findElement(By.xpath("//h5[contains(@class,'MuiTypography-root ')]/child::strong")).isDisplayed();

		if (login_Page) {

			System.out.println("Login page is opened succesfully");
		}

	}
}
