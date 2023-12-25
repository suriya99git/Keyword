package Wooden_Street;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.woodenstreet.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='continue']")));
		driver.findElement(By.id("loginclose1")).click();
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Sofas']"))).build().perform();
	}
}
