package practice;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P27 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')] )[1]")).click();
		
		 List<WebElement> add_button = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		 for (WebElement Element : add_button) {
			 Thread.sleep(1000);
			Element.click();
		}
		
		 driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
//		 List<WebElement> check_box = driver.findElements(By.xpath("//input[@name='removefromcart']"));
//		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		 for (WebElement Element : check_box) {
//			 wait.until(ExpectedConditions.elementToBeClickable(By.name("removefromcart")));
//			Element.click();
//		}
//		
//		 driver.findElement(By.name("updatecart")).click();
//		 
		 int num = 0;
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='product-unit-price']"));
		
		for (WebElement Element : price) {
					 
//			double p = Double.parseDouble(Element.getText());
//			Thread.sleep(1000);
//			if (p>num) {
//				num=(int) p;
//			}
			
			String p = Element.getText();
			 String p1 = p.replace(".00","");
			 
			int p2 =  Integer.parseInt(p1);
			Thread.sleep(1000);
			if (p2>num) {
				
				num = p2;
			}
		}
		System.out.println(num);
		
//		driver.findElement(By.xpath("//span[contains(text(),'"+num+"')]/parent::td/preceding-sibling::td/child::input[@name='removefromcart']")).click();
//		driver.findElement(By.name("updatecart")).click();
		//System.out.println(num);
		
	}
}
