package Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUtility {

   static  WebDriver driver = new ChromeDriver();
   
    
    public static void login() {
    	
    	driver.get(TestDataUtility.url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
    	driver.findElement(By.id("Email")).sendKeys(TestDataUtility.username);
    	driver.findElement(By.id("Password")).sendKeys(TestDataUtility.password);
    	driver.findElement(By.xpath("//span[text()='Login']")).click();
    }
 
    	
}
