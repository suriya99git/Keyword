package Make_My_trip;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://www.makemytrip.com/");
		
		wait.until(ExpectedConditions.attributeContains(By.id("second-img"), null, null));
		driver.findElement(By.xpath("//a[@class='close']")).click();
	}
}
