package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_form_using_Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		
		driver.findElement(By.xpath("(//input[@class='text-box single-line'])[1]")).sendKeys("suriya");
		
		driver.findElement(By.xpath("(//input[@class='text-box single-line'])[2]")).sendKeys("johnson");
		
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("sj02199@gmail.com");
		
		driver.findElement(By.xpath("(//input[@class='text-box single-line password'])[1]")).sendKeys("Suriya@123");
		
		driver.findElement(By.xpath("(//input[@class='text-box single-line password'])[2]")).sendKeys("Suriya@123");
		
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sj02199@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Suriya@123");
		
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		driver.findElement(By.xpath("(//a[contains(text(),'Apparel & Shoes')])[1]")).click();
		
		driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[@class='color'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-28']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();
		
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		
		driver.findElement(By.xpath("//button[@name='checkout']")).click();
		
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_Company']")).sendKeys("Test_Yantra");
		
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']")).sendKeys("Bangalore");
		
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']")).sendKeys("banshankari");
		
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address2']")).sendKeys("Kr_road,jp nagar");
		
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']")).sendKeys("600039");
		
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']")).sendKeys("9845338923");
		
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_FaxNumber']")).sendKeys("56789");
		
		
		
		
		
	}
}
