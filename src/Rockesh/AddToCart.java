package Rockesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCart extends BaseTest {

	@Test
	public  void addToCartTestCase() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(2000);
		
		//Removing the previous Cart
		 List<WebElement> remove = driver.findElements(By.xpath("//span[text()='Remove:']/following-sibling::input[@type='checkbox']"));
		 for (WebElement Element : remove) {
			 Thread.sleep(1000);
			Element.click();
		}
		driver.findElement(By.name("updatecart")).click();
		Thread.sleep(2000);
		
		//adding new iteam in the cart
		driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[1]")).click();
		
		List<WebElement> addcart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		
		for (WebElement button : addcart) {
			
			Thread.sleep(2000);
			button.click();
		}
		
		String qty = driver.findElement(By.xpath("//span[@class='cart-qty']")).getText();
		
		Assert.assertEquals(qty,"(3)");
	}
}
