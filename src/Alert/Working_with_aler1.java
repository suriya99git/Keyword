package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_aler1 {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		WebElement double_click = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		//to per form double click
		Actions a = new Actions(driver);
		a.doubleClick(double_click).perform();
		
		//to move the cursor to alert popup
		Alert al = driver.switchTo().alert();
		
		//to print the text which contains in the popup
		String popup_text = al.getText();
		System.out.println(popup_text);
		
		//to accept the popup
		al.accept();
	}
}
