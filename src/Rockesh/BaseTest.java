package Rockesh;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {

	WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Establish the server");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Establish the connection to DB");
	}
	
	@BeforeClass
	public void launchBrowser() {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Reporter.log("launch browser",true);
	}
	
	@BeforeMethod
	public void login() {
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("admin02@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Admin02");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		Reporter.log("login",true);
	}
	
	
	@AfterMethod
	public void logOut()
	{
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		Reporter.log("logout",true);
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
		Reporter.log("close the browser",true);
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("disconnect to DB");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("disconnect the server");
	}
	
	
	
}
