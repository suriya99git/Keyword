package practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://shoppersstack.com/");

		 String parent = driver.getWindowHandle();
		 

		driver.findElement(By.xpath("//a[@href='https://voucher.shoppersstack.com']")).click();

		Set<String> child = driver.getWindowHandles();

		for (String s : child) {

			driver.switchTo().window(s);

			if (!(driver.getWindowHandle().contains(parent))) {
				
			
				System.out.println(s);
			}
		}
	}
}
