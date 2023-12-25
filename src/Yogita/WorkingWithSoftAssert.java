package Yogita;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class WorkingWithSoftAssert {

	@Test
	public void m1() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		SoftAssert s = new SoftAssert();
		
		s.assertEquals(driver.getCurrentUrl(),"https://demowebshop.tricentis.com/");
		s.assertAll();
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("yogbelavanaki@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Password@123");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
	  //  Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Log out']")).isDisplayed());
	    Assert.assertEquals(driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText(),"yogbelavanaki@gmail.com");
	   
	    
	}
}
