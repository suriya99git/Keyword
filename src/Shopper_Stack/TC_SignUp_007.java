package Shopper_Stack;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
public class TC_SignUp_007 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://shoppersstack.com/");

		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();

		driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]")).click();

		WebElement	signin = driver.findElement(By.linkText("Sign In"));

		Actions actions = new Actions(driver);

		actions.moveToElement(signin).perform();
		WebElement	c = driver.findElement(By.linkText("Sign In"));

		String link_color = c.getCssValue("color");

		String color_res = Color.fromString(link_color).asHex();

		System.out.println(color_res);





	}
}
