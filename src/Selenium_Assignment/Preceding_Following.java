package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Preceding_Following {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		//Book
		driver.findElement(By.xpath("(//ul)[2]/child::li/child::a")).click();
		//computing and networking
		//add to cart
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[contains(text(),'Computing')])[1]/parent::h2/following-sibling::div[3]/child::div[2]/child::input")).click();
		Thread.sleep(1000);
		
		
		//Appearl and Check
		driver.findElement(By.xpath("(//ul)[2]/child::li[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Blue and green Sneaker')]/parent::h2/following-sibling::div[3]/child::div[2]/child::input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'overview')])[1]/child::div[7]/child::div/child::input[2]")).click();
		
		//Digital Download
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//ul)[2]/child::li[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[contains(text(),'Music')])[2]/parent::h2/following-sibling::div[3]/child::div[2]/child::input")).click();
		
		//Jwellery
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//ul)[2]/child::li[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Create Your Own Jewelry')]/parent::h2/following-sibling::div[3]/child::div[2]/child::input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'overview')][1]/child::div[4]/child::dl/child::dd[2]/child::input")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'overview')]/child::div[6]/child::div/child::input[2]")).click();
		
		//GiftCard
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//ul)[2]/child::li[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'product-item')])[1]/child::div[2]/child::div[3]/child::div[2]/child::input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'overview')])[1]/child::div[4]/child::div[1]/input")).sendKeys("johnson");
		driver.findElement(By.xpath("(//div[contains(@class,'overview')])[1]/child::div[4]/child::div[2]/input")).sendKeys("Johnson@gmail.com");
		driver.findElement(By.xpath("(//div[contains(@class,'overview')])[1]/child::div[4]/child::div[3]/input")).sendKeys("Suriya");
		driver.findElement(By.xpath("(//div[contains(@class,'overview')])[1]/child::div[4]/child::div[4]/input")).sendKeys("Suriya@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'overview')])[1]/child::div[6]/child::div/child::input[2]")).click();
		
		//Check the cart
		driver.findElement(By.xpath("(//input[contains(@class,'search')])[1]/parent::form/parent::div/preceding-sibling::div[1]/child::div/child::ul/child::li[3]/child::a/child::span[1]")).click();
		
	}
}
