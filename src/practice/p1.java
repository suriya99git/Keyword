package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class p1 {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//input[@id='small-searchterms']"))).click().keyDown(Keys.SHIFT).sendKeys("comp").keyUp(Keys.SHIFT).perform();
		a.moveToElement(driver.findElement(By.xpath("//a[@id='ui-id-6']"))).click().perform();
		driver.close();
		
		driver.quit();
		
	}
}
