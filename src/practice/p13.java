package practice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class p13 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions actions = new Actions(driver);
		actions.contextClick(right_click);
		List<WebElement> all = driver.findElements(By.xpath("(//ul)[3]/child::li/child::span"));
		for (WebElement Element : all) {
			actions.moveToElement(Element).click().build().perform();
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
			actions.contextClick(right_click);
		}
	}
}
