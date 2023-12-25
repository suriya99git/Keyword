package Working_with_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class working_With_rightclick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium webdriver\\\\Selenium\\\\Driver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
	WebElement right_click = driver.findElement(By.xpath("//span[contains(text(),'right')]"));
	
	Actions a = new Actions(driver);
	//for do right click----->contextclick(webelement)
	//for to do double click---->doubleclick(webelement)
	a.contextClick(right_click).build().perform();
	a.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Copy')]"))).click().perform();
		
	}
}
