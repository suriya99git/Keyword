package seleeniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();

		WebElement position = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		
		Select s = new Select(position);
		
//		s.selectByIndex(1);
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//		s.selectByValue("12");
//		
		s.selectByVisibleText("https://demowebshop.tricentis.com/books?pagesize=4");
	}
}
