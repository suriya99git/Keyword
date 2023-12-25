package practice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice {

	public static void main(String[] args) {
		
		WebDriver driver  = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='radioButton']"));
		
		for (WebElement Element : radio) {
			Element.click();
		}
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("India");
		
		Select select  = new Select(driver.findElement(By.id("dropdown-class-example")));
		
		select.selectByVisibleText("Option3");
		
		List<WebElement> check_list = driver.findElements(By.xpath("(//fieldset)[4]/child::label/child::input"));
		
		for(WebElement element : check_list) {
			element.click();
		}
		
		String parent = driver.getWindowHandle();
		
		
		driver.findElement(By.id("openwindow")).click();
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allwindow = driver.getWindowHandles();
		
		
		for (String string : allwindow) {
			
			driver.switchTo().window(string);
			
			if (!(driver.getWindowHandle().equalsIgnoreCase(parent))){
				
				
				driver.findElement(By.xpath("(//a[text()='Courses'])[1]")).click();
				
				driver.close();
				
			}
			
		}
		driver.findElement(By.xpath("//a[text()='Open Tab']")).click();
		//driver.navigate().back();
		
		//driver.findElement(By.id("name")).sendKeys("suriya");
	}
}
