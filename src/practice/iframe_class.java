package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_class {

public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/suriy/Downloads/iframe.html");
		
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.id("click-to-show")).click();
		
		driver.switchTo().defaultContent();
		
		
		
		
		
}
}
