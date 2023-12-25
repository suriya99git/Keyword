package Integration_testing_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Integration_07 {


public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://shoppersstack.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Admin Login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("suriyajohnson088@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("Suriya@shopper1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(1000);
		boolean Merchent = driver.findElement(By.xpath("//button[text()='Approved Merchant']")).isDisplayed();

		if (Merchent) {
			System.out.println("Merchent list   is displayed");
		}
		else {
			System.out.println("Merchent list  is Not displayed");
		}
		
	}
}
