package Selenium_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_select5 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/suriy/Downloads/demo.html");


		List<WebElement> cars = driver.findElements(By.xpath("//select[@id='standard_cars']/child::option"));

		for (WebElement Element : cars) {
			System.out.println(Element.getText());
			Element.click();
		}
		
		WebElement car = driver.findElement(By.xpath("(//select)[1]"));

		Select s = new Select(car);

		List<WebElement> selectall = s.getOptions();

		for (WebElement Element : selectall) {
			System.out.println(Element.getText());
			Element.click();
			
		}
		
		for (int i = 0; i < selectall.size(); i++) {
			if (selectall.get(i).getText().equals("Volvo")) {
				System.out.println(i);
			}
		}
	}
}
