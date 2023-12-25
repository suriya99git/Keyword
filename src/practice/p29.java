package practice;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class p29 {

	public static void main(String[] args) throws IOException {
		
//		LocalDateTime date = LocalDateTime.now();
//		
//		String current_date = date.toString().replaceAll(":","-");
				
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> alllink = driver.findElements(By.tagName("a"));
		
		for (WebElement Element : alllink) {
			
			System.out.println(Element.getText());
		}
//		driver.findElement(By.id("small-searchterms"));
//		Dimension size = driver.findElement(By.id("")).getSize();
//		int hieght = size.getHeight();
//		 int widh = size.getWidth();
//		 
//		driver.get("https://demowebshop.tricentis.com/");
//		
//		WebElement searchfield = driver.findElement(By.id("small-searchterms"));
//		
//		File temp1 = searchfield.getScreenshotAs(OutputType.FILE);
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		
//		File temp = ts.getScreenshotAs(OutputType.FILE);
//		
//		File perm = new File("screenshot//filename"+current_date+".png");
//		
//		FileHandler.copy(temp1, perm);
		
	}
}
