package Working_with_disable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Disable_text {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapp.skillrary.com/index.php");
		
		WebElement disable_text = driver.findElement(By.xpath("//input[@class='form-control']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].value='hello';",disable_text);
	}
}
