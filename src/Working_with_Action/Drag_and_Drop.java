package Working_with_Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium webdriver\\\\Selenium\\\\Driver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		WebElement country_1 = driver.findElement(By.id("box101"));
		WebElement capital_1 = driver.findElement(By.id("box1"));
		
		WebElement country_2 = driver.findElement(By.id("box107"));
		WebElement capital_2 = driver.findElement(By.id("box7"));

		WebElement country_3 = driver.findElement(By.id("box104"));
		WebElement capital_3 = driver.findElement(By.id("box4"));

		WebElement country_4 = driver.findElement(By.id("box105"));
		WebElement capital_4 = driver.findElement(By.id("box5"));

		WebElement country_5 = driver.findElement(By.id("box106"));
		WebElement capital_5 = driver.findElement(By.id("box6"));

		WebElement country_6 = driver.findElement(By.id("box102"));
		WebElement capital_6 = driver.findElement(By.id("box2"));

		WebElement country_7 = driver.findElement(By.id("box103"));
		WebElement capital_7 = driver.findElement(By.id("box3"));
		Actions a = new Actions(driver);
		
		a.dragAndDrop(capital_7, country_7).build().perform();
		a.dragAndDrop(capital_1, country_1).build().perform();
		a.dragAndDrop(capital_2, country_2).build().perform();
		a.dragAndDrop(capital_3, country_3).build().perform();
		a.dragAndDrop(capital_4, country_4).build().perform();
		a.dragAndDrop(capital_5, country_5).build().perform();
		a.dragAndDrop(capital_6, country_6).build().perform();
		
	}
}
