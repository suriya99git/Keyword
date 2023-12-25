package Integration_testing_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_Integration_10 {


public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
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
		driver.findElement(By.xpath("//button[@aria-label='Show filters']")).click();
		Thread.sleep(1000);
		WebElement id = driver.findElement(By.xpath("(//select)[2]"));
		Select s = new Select(id);
		s.selectByValue("companyName");
		Thread.sleep(1000);
		WebElement operator = driver.findElement(By.xpath("(//select)[3]"));
		Select s1 = new Select(operator);
		Thread.sleep(1000);
		s1.selectByValue("is not empty");
		Thread.sleep(1000);
		boolean filter_count = driver.findElement(By.xpath("//span[text()='1']")).isDisplayed();
		if(filter_count) {
			System.out.println("It is display number of active filter");
		}
		else {
			System.out.println("It is not display number of active filter");
		}
	}
}
