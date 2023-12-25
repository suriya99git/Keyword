package harsha;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_class {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/suriy/Downloads/practice/demo.html");
		
		WebElement drop_down = driver.findElement(By.xpath("//select[@id='standard_cars']"));
		
		Select select = new Select(drop_down);
		
		//select.selectByIndex(2);
		
		//select.selectByValue("jgr");
		
		//select.selectByVisibleText("Mercedes");
		
		//select.deselectByVisibleText("Mercedes");
		
		//System.out.println(select.isMultiple());
		
		int size = select.getOptions().size();
		
		for (int i = 0; i < size; i++) {
			
			select.selectByIndex(i);
			
		}
		
		ArrayList list = new ArrayList();
		List<WebElement> all_option = select.getOptions();
		
		for (WebElement Element : all_option) {
			
			list.add(Element.getText());
		}
		
		System.out.println(list);
		
	}
}
