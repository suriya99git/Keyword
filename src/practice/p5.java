package practice;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class p5 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/suriy/Downloads/iframe.html");

		driver.switchTo().frame("frame2");
		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.xpath("(//img[contains(@class,'img-fluid search-icon')])[3]"))).click().perform();
		a.moveToElement(driver.findElement(By.id("txt_sm_search"))).click().sendKeys("cars").perform();
		a.moveToElement(driver.findElement(By.xpath("(//img[contains(@class,'img-fluid search-icon')])[3]"))).click().perform();

		List<WebElement> alltext = driver.findElements(By.xpath("//h6[contains(@class,'new-heding-h6')]"));

		for (WebElement Element : alltext) {
			System.out.println(Element.getText());

		}
		driver.switchTo().defaultContent();

		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[contains(@class,'button-1 search-box-button')]")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("(//img[contains(@class,'img-fluid hd-sos-icon')])[4]")).click();
		Set<String> w = driver.getWindowHandles();
		for (String s: w) {
			driver.switchTo().window(s);
			System.out.println(driver.getTitle().contains("Autocar India - YouTube"));
			if(driver.getTitle().contains("Autocar India - YouTube")) {
				driver.findElement(By.xpath("//input[@id='search']")).sendKeys("car");
				Actions act  = new Actions(driver);
				Thread.sleep(2000);
				act.moveToElement(driver.findElement(By.xpath("//button[@id='search-icon-legacy']"))).perform();
				act.keyDown(Keys.ENTER).perform();
				Thread.sleep(2000);
			}

			
		}
	}
}
