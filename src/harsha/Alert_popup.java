package harsha;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_popup {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();

		WebElement double_click = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions actions = new Actions(driver);
		
		actions.doubleClick(double_click).build().perform();
		
		Alert alert  = driver.switchTo().alert();
		
		alert.accept();
		
	}
}
