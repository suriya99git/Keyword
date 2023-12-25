package Working_With_IFRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_Swithto_index {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/suriy/Downloads/iframe.html");
		//swith to the demowebshop frame
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("small-searchterms")).sendKeys("keyboard");
		
		driver.findElement(By.cssSelector("input[class='button-1 search-box-button']")).click();
		//come back to parent frame
		driver.switchTo().defaultContent();
		
		Actions a = new Actions(driver);
		
		
	}

}
