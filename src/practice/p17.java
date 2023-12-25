package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p17 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
        WebDriver driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("file:///C:/Users/suriy/Downloads/practice/demo.html");
        
       List<WebElement> check_box = driver.findElements(By.xpath("//th[text()='Select']/parent::tr/following-sibling::tr/child::td/child::input"));
        List<WebElement> language = driver.findElements(By.xpath("//th[text()='Language']/parent::tr/following-sibling::tr/child::td[1]"));
        List<WebElement> os = driver.findElements(By.xpath("//th[text()='OS']/parent::tr/following-sibling::tr/child::td[1]"));
         List<WebElement> version = driver.findElements(By.xpath("//th[text()='OS']/parent::tr/following-sibling::tr/child::td[2]"));
        List<WebElement> name = driver.findElements(By.xpath("//th[text()='Name']/parent::tr/following-sibling::tr/child::td[1]"));
        List<WebElement> check_box_1 = driver.findElements(By.xpath("//th[text()='JavaScript Confirmation']/parent::tr/following-sibling::tr/child::td/child::input"));
        
       for (WebElement Element : check_box) {
		
    	   Element.click();
	}
       for (WebElement Element : language) {
		
    	  System.out.println(" Language "+Element.getText());
    	   
	   }
        
		for (WebElement Element : os) {
			
			System.out.println(" OS"+Element.getText());
		}
		
		for (WebElement Element : version) {
			
			System.out.println(" Version "+Element.getText());
		}
		
		for (WebElement Element : name) {
			
			System.out.println(" Name "+Element.getText());
		}
		
		for (WebElement Element : check_box_1) {
			
			Element.click();
		}
		
		driver.findElement(By.xpath("//th[text()='File Upload Popup']/parent::tr/following-sibling::tr/child::td/child::input[@type='file']")).sendKeys("C:\\Users\\suriy\\OneDrive\\Documents\\suriya resume (4).docx");
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(driver.findElement(By.id("iphone"))).build().perform();
		
		actions.doubleClick(driver.findElement(By.id("double-click"))).build().perform();
		
		driver.findElement(By.id("iphone")).click();
		
		actions.moveToElement(driver.findElement(By.id("standard_cars"))).build().perform();
		Select select = new Select(driver.findElement(By.id("standard_cars")));
		
		List<WebElement> car = select.getOptions();
		
		for (WebElement Element : car) {
			Element.click();
			System.out.println("Cars Name :"+Element.getText());
		}
		
		List<WebElement> same_name = driver.findElements(By.xpath("//th[text()='Multiple Elements with same \"name\" property']/parent::tr/following-sibling::tr/child::td/child::input"));
		
		for (WebElement Element : same_name) {
			
			Element.sendKeys("Suriya");
		}
		
		driver.findElement(By.id("firstname")).sendKeys("Suriya");
		driver.findElement(By.id("lastname")).sendKeys("Johnson");
		driver.findElement(By.id("submit")).click();
		
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Webshop']")).click();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> all_window = driver.getWindowHandles();
		
		for (String string : all_window) {
			
			driver.switchTo().window(string);
			if(driver.getWindowHandle().contains(parent)) {
				
				driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
				Robot robot  = new Robot();
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_ENTER);
			}
		}
		
	}
}
