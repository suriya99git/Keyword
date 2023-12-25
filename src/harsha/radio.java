package harsha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/mortgage-payoff-calculator.html");
		WebElement radio_button = driver.findElement(By.xpath("(//label[@class='cbcontainer'])[1]"));	
		System.out.println("Before selecting :"+radio_button.isSelected());	
		radio_button.click();
		System.out.println(driver.findElement(By.id("cpayoff1")).isSelected());
		//System.out.println("After selecting :"+radio_button.isSelected());
	}
}
