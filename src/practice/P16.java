package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P16 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		Actions actions = new Actions(driver);

		actions.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).build().perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		Alert a = wait.until(ExpectedConditions.alertIsPresent());

		a.accept();	
	}

}


