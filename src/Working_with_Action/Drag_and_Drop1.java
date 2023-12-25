package Working_with_Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop1 {


public class Drag_and_Drop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium webdriver\\\\Selenium\\\\Driver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		String[] country = {"box101","box102","box103","box104","box105","box106","box107"};
		String [] capital  = {"box1","box2","box3","box4","box5","box6","box7"};
		
		Actions a = new Actions(driver);
		
		for (int i = 0; i < capital.length; i++) {
			WebElement ctry = driver.findElement(By.id(country[i]));
			WebElement cap = driver.findElement(By.id(capital[i]));
			
			a.dragAndDrop(ctry, cap).build().perform();
		}
	}

}
}
