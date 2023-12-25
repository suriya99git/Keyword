package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.hssf.record.CalcCountRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p18 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement table = driver.findElement(By.xpath("//legend[text()='Web Table Example']"));
		
		driver.executeScript("arguments[0].scrollIntoView(true);", table);
		
		 List<WebElement> course = driver.findElements(By.xpath("(//fieldset)[8]//tr/child::td[2]"));
		 
		 List<WebElement> price = driver.findElements(By.xpath("(//fieldset)[8]//tr/child::td[3]"));
		
		 //type 1
//		TreeMap map = new TreeMap<>();
//		
//		 ArrayList p = new ArrayList();
//		 for (WebElement Element : price) {
//			
//			 
//			 p.add(Element.getText());
//		}
//	    ArrayList c = new ArrayList();
//		 for ( WebElement Element : course) {
//			
//			 c.add(Element.getText());
//		}
//		 
//		 for(int i=0;i<p.size();i++) {
//			 map.put(p.get(i), c.get(i));
//		 }
//		 System.out.println(map);
//		Object res = map.lastEntry().getValue();
//		System.out.println(res);
		
		 
		 //type 2
//		int high_price = Integer.MIN_VALUE;
//		String high_course = "";
//		
//		for (int i = 0; i < price.size(); i++) {
//			
//			String c = course.get(i).getText();
//			int p = Integer.parseInt(price.get(i).getText());
//			
//			if (p > high_price) {
//		        high_price= p;
//		        high_course = c;
//		    }
//		}
//		
//		System.out.println(high_course);

		//type = 3 
		int a[] = new int[price.size()] ;
		String string = "";
		int temp = 0;
		for (int i = 0; i < price.size(); i++) {
			
			a[i]= Integer.parseInt(price.get(i).getText()) ;
			
			if (a[i]>temp) {
				
				temp = a[i];
				string = course.get(i).getText();
			}
		}
		System.out.println(string);
	}
}
