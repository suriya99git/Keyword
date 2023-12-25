package Alert;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_alert2 {

	public static void main(String[] args) throws InterruptedException {
	//	System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));

		Actions a = new Actions(driver);
		a.contextClick(right_click).build().perform();
		List<WebElement> all_popup = driver.findElements(By.xpath("//ul/li/span"));
		System.out.println(all_popup.size());
		for (WebElement Element : all_popup) {
			a.moveToElement(Element).click().perform();
			Alert a1 = driver.switchTo().alert();
			System.out.println(a1.getText());
			a1.accept();
			a.contextClick(right_click).build().perform();
		}	
	}
}
