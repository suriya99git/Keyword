package Working_with_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium webdriver\\\\Selenium\\\\Driver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement electronic = driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(electronic).build().perform();
		
		a.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Camera, photo')])[1]"))).click().perform();
	}
}
