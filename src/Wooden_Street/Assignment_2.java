package Wooden_Street;

import java.time.Duration;
import java.util.Set;

import javax.swing.JScrollBar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_2 {

	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.woodenstreet.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='continue']")));
		driver.findElement(By.id("loginclose1")).click();
	//	driver.findElement(By.xpath("//div[@id='loginclose1']")).click();
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Sofas']"))).build().perform();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Sofas']")));
		driver.findElement(By.xpath("//a[text()='Sofa Sets ']/following-sibling::a[text()=' Sofa Cum Bed']")).click();
		if (driver.getTitle().contains("Sofa Cum Bed")) {

			driver.findElement(By.xpath("//div[@class='cart-hover']/child::p[@onclick='addToCart($(this),66950);']")).click();
		}
		else {
			System.out.println("Not found");
		}

		Set<String> window = driver.getWindowHandles();

		for (String string : window) {

			driver.switchTo().window(string);

			if (driver.getTitle().contains("Buy Feltro")) {
				WebElement scroll = driver.findElement(By.xpath("//p[text()='Product Overview']"));
				js.executeScript("arguments[0].scrollIntoView(false);" ,scroll);
				driver.findElement(By.xpath("//a[@class='buy-now button-Add-Cart '] ")).click();
			}
		}

		a.moveToElement(driver.findElement(By.xpath("//a[text()='Living']"))).build().perform() ;

		driver.findElement(By.xpath("//a[text()='TV Units']")).click();

		driver.findElement(By.xpath("(//img[contains(@title,'Hailey Engineered')])[1]")).click();

		Set<String> second = driver.getWindowHandles();

		for (String string : second) {
			driver.switchTo().window(string);
			if (driver.getTitle().contains("Buy Hailey")) {
				WebElement scroll = driver.findElement(By.xpath("//p[text()='Product Overview']"));
				js.executeScript("arguments[0].scrollIntoView(false);", scroll);
				driver.findElement(By.xpath("//a[@class='buy-now button-Add-Cart ']")).click();

			}

		}

		a.moveToElement(driver.findElement(By.xpath("(//a[text()='Bedroom'])[1]"))).build().perform();
		driver.findElement(By.xpath("(//a[text()='King Size Beds'])[2]")).click();
		driver.findElement(By.xpath("(//img[contains(@title,'Ferguson')])[1]")).click();
		Set<String> third = driver.getWindowHandles();

		for (String string : third) {
			driver.switchTo().window(string);
			if (driver.getTitle().contains("Buy Ferguson")) {
				WebElement scroll = driver.findElement(By.xpath("//p[text()='Product Overview']"));
				js.executeScript("arguments[0].scrollIntoView(true);", scroll);
				driver.findElement(By.xpath("//a[@class='buy-now button-Add-Cart ']")).click();
			}
		}
	}
}
