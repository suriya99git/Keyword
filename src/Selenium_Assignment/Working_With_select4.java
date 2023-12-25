package Selenium_Assignment;

import java.util.List;
import java.util.jar.Attributes.Name;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_select4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();

		WebElement position = driver.findElement(By.xpath("//select[@id='products-orderby']"));

		Select s = new Select(position);

		List<WebElement> selectall = s.getOptions();
		int i=0;
		for (WebElement Element : selectall) {

			//System.out.println(Element.getText());
			if(Element.getText().equals("Price: Low to High"))
			{
				System.out.println(i);
			}
			else {

				i++;

			}

		}
		//		for (int i = 0; i < selectall.size(); i++) {
		//			
		//			if (selectall.get(i).getText().equals("Price: Low to High")) {
		//				System.out.println(i);
		//			}
		//		}
		driver.quit();

	}




}
