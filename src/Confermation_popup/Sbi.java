package Confermation_popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sbi {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm#");
		
		driver.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]")).click();
		
		driver.findElement(By.xpath("//a[text()='New User ? Register here/Activate ']")).click();
		
		 String parent = driver.getWindowHandle();
		Alert alert  = driver.switchTo().alert();
		
		alert.accept();
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		 Set<String> all_window = driver.getWindowHandles();
		
		 all_window.remove(parent);
		 
		 for (String s :  all_window ) {
			driver.switchTo().window(s);
			
		}
		driver.findElement(By.id("nextStep")).click();
		
		
	}
}
