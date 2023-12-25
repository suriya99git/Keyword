package harsha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/suriy/Downloads/MultipleSelect.html");
		
		WebElement car_drop = driver.findElement(By.id("cars"));
		
		Select select = new Select(car_drop);
		
		System.out.println(select.isMultiple());
		
		select.selectByIndex(2);
		
		Thread.sleep(1000);
		
		select.deselectByIndex(2);
		int size = select.getOptions().size();
		
//		for (int i = 0; i < size; i++) {
//			
//			select.selectByIndex(i);
//		}
		
		System.out.println(select.getFirstSelectedOption().getText());
		//select.getAllSelectedOptions()
		select.deselectAll();
	}
}
