package Yogita;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(ListenerImplementation.class)
public class WorkingWIthDataProvide_Login {

	@Test(dataProvider = "loginData")
	public void test(String username,String password) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	}
	
	@DataProvider(name = "loginData")
	 public Object[][] login(){
		
		Object[][] data = new Object[2][2];
		data[0][0] = "suriya@gmail.com";
		data[0][1] ="Suri@09";
		data[1][0] = "john@gmail.com";
		data[1][1] = "John@09";
		return data;
	}
	
	
	 
}
