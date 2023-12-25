package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P14 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm#");
		driver.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='New User ? Register here/Activate ']")).click();
	    String parent = driver.getWindowHandle();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		Set<String> child = driver.getWindowHandles();
		
		child.remove(parent);
		
		for (String s : child) {
			driver.switchTo().window(s);
			driver.findElement(By.id("nextStep")).click();
		}
		
	}
}
