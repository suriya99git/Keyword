package Wooden_Street;

import java.time.Duration;
import java.util.Set;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.woodenstreet.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[@id='loginclose1']")).click();

		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.xpath("//a[text()='Sofas']"))).build().perform();

		driver.findElement(By.xpath("(//article/child::a[text()='Fabric Sofas'])[1]")).click();

		
		driver.findElement(By.xpath("(//p[text()=' Add to Cart'])[1]")).click();

		a.moveToElement(driver.findElement(By.xpath("//a[text()='Living']"))).build().perform();
		driver.findElement(By.xpath("//a[text()='TV Units']")).click();

		driver.findElement(By.xpath("(//a[contains(text(),'Jett Metal Base')])[1]")).click();

		WebElement element = driver.findElement(By.xpath("//a[@class='buy-now button-Add-Cart ']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);",element);
		driver.findElement(By.xpath("//a[@class='buy-now button-Add-Cart ']")).click();

		a.moveToElement(driver.findElement(By.xpath("(//a[text()='Bedroom'])[1]"))).build().perform();

		driver.findElement(By.xpath("//article/child::a[text()='King Size Beds']")).click();

		driver.findElement(By.xpath("(//img[contains(@title,'Ferguson Sheesham')])[1]")).click();

		Set<String> window = driver.getWindowHandles();

		for (String string : window) {
			driver.switchTo().window(string);

			if(driver.getTitle().contains("Buy Ferguson Sheesham Wood Bed With Storage Drawers")) {
				WebElement bed = driver.findElement(By.xpath("//a[@class='buy-now button-Add-Cart ']"));
				js.executeScript("arguments[0].scrollIntoView(true);", bed);
				driver.findElement(By.xpath("//a[@class='buy-now button-Add-Cart']")).click();
			}

		}
		driver.findElement(By.xpath("//a[@title='Cart']")).click();
		String bed = driver.findElement(By.xpath("//img[contains(@title,'Ferguson')]/parent::a/parent::div/following-sibling::div/child::div[2]/child::strong")).getText();
		String sofa = driver.findElement(By.xpath("//img[contains(@title,'Henry')]/parent::a/parent::div/following-sibling::div/child::div[2]/child::strong")).getText();
		String tv = driver.findElement(By.xpath("//img[contains(@title,'Jett')]/parent::a/parent::div/following-sibling::div/child::div[2]/child::strong")).getText();
		System.out.println(bed);
		System.out.println(sofa);
		System.out.println(tv);

		bed = bed.substring(3).replace(",", "");
		sofa = sofa.substring(3).replace(",", "");
		tv = tv.substring(3).replace(",", "");

		int bed_price = Integer.parseInt(bed);
		int sofa_price = Integer.parseInt(sofa);
		int tv_price= Integer.parseInt(tv);

		WebElement bed_remove = driver.findElement(By.xpath("(//p[@class='cartbtn delete-btn'])[1]"));
		WebElement sofa_remove = driver.findElement(By.xpath("(//p[@class='cartbtn delete-btn'])[2]"));
		WebElement tv_remove = driver.findElement(By.xpath("(//p[@class='cartbtn delete-btn'])[3]"));
		TreeMap<Integer, WebElement> t = new TreeMap<>();

		t.put(bed_price, bed_remove);
		t.put(sofa_price,sofa_remove);
		t.put(tv_price, tv_remove);

		WebElement remove = t.lastEntry().getValue();

		remove.click();
		driver.quit();
		//	    
		//	    int[] price= {bed_price,sofa_price,tv_price};
		//	    
		//	    Arrays.sort(price);
		//	     
		//	   
		//	    System.out.println(Arrays.toString(price));
		//		
		//	    String[]remove= {bed,sofa,tv};
		//	    
		//	    for (int i = 0; i < remove.length; i++) {
		//			if(remove[i].contains("+price.length-1+")) {
		//				
		//			}
		//		}

	}
}
