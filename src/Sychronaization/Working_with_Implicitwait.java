package Sychronaization;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Implicitwait {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");
		driver.close();

	}
}
