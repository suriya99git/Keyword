package watch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fireBoult {

	WebDriver driver;
	@Test
	
	public  void openFireboult() {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fireboltt.com/");
	}
//	@Test(priority = 1,dependsOnMethods = "openFireboult")
//	public void creatAccount() {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.findElement(By.xpath("//a[@class='site-nav__link site-nav__link--icon medium-down--hide']")).click();
//		driver.close();
//	}
}
