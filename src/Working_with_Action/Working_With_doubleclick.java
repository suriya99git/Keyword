package Working_with_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_doubleclick {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium webdriver\\\\Selenium\\\\Driver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		WebElement double_click = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));

		Actions a = new Actions(driver);

		a.doubleClick(double_click).build().perform();
		
	
	}
}
