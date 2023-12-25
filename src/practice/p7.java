package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p7 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.id("loginBtn")).click();
	driver.findElement(By.id("vertical-tab-2")).click();
	driver.findElement(By.id("email")).sendKeys("praneethkumar1821@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Praneeth@123");
	driver.findElement(By.xpath("//span[text()='Login']")).click();
	driver.findElement(By.xpath("(//div[text()='P'])[1]")).click();
	driver.findElement(By.xpath("//li[text()='My Profile']")).click();
	driver.findElement(By.xpath("//button[contains(text(),'Edit Profile')]")).click();
	WebElement firstname = driver.findElement(By.id("First Name"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].value='kumar';", firstname);
	driver.findElement(By.id("Submit")).click();
}
}
