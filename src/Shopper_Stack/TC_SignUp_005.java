package Shopper_Stack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_SignUp_005 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://shoppersstack.com/");

		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();

		driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]")).click();

		WebElement	signin = driver.findElement(By.xpath("//a[@id='signIn']"));


		Actions actions = new Actions(driver);
		
		actions.moveToElement(signin).perform();
		



	}
}
