package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class naukiri_project {


public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.naukri.com/mnjuser/homepage");
		
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.xpath("//div[text()='Companies']"))).build().perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.xpath("//div[text()='Unicorn']"))).click().build().perform();
}
}
