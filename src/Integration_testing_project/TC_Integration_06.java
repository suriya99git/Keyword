package Integration_testing_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Integration_06 {

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
		driver.findElement(By.xpath("//div[text()='S']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='My Profile']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Edit Profile')]")).click();
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.xpath("//input[@id='Phone Number']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='9999999999';", email);
		 
		 Thread.sleep(1000);
		
		 driver.findElement(By.xpath("//button[@id='Submit']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[text()='S']")).click();
		 driver.findElement(By.xpath("//li[text()='My Profile']")).click();
		String updated_phoneNumber = driver.findElement(By.xpath("(//tbody/child::tr/child::td)[4]")).getText();
		 

		if (updated_phoneNumber.equalsIgnoreCase("johnson@gmail.com")) {
			System.out.println("updated data  is displayed");
		}
		else {
			System.out.println("updated data  is Not displayed");
		}
		
	}
}
