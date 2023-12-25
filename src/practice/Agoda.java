package practice;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Agoda {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.agoda.com/");
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.getDayOfMonth());
		System.out.println(ldt.getMonth());
		System.out.println(ldt.getYear());
		
//		driver.findElement(By.xpath("//i[@class='ficon IconBox__icon ficon-20 ficon-check-in']")).click();
//		driver.findElement(By.xpath("//div[@aria-label='Wed Oct 18 2023']")).click();
//		driver.findElement(By.xpath("//div[@aria-label='Sat Oct 21 2023']")).click();
	}
}
