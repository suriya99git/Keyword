package Make_My_trip;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import practice.iframe_class;

public class Assignment {

	static int i,j,k,l = 0;
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.makemytrip.com/");

	//	driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();

		WebElement from = driver.findElement(By.id("fromCity"));

		FileInputStream fileInputStream  = new FileInputStream("testData//makemytrip.xlsx");

		XSSFWorkbook xlsx = new XSSFWorkbook(fileInputStream);

		String from_location = xlsx.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		String to_location = xlsx.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		String date = xlsx.getSheet("sheet1").getRow(2).getCell(0).getStringCellValue();
		
		Actions actions  = new Actions(driver);

		actions.moveToElement(from).click().sendKeys(from_location).build().perform();

		actions.moveToElement(driver.findElement(By.xpath("//p[text()='Chennai, India']"))).click().build().perform();

		WebElement to = driver.findElement(By.id("toCity"));

		actions.moveToElement(to).click().sendKeys(to_location).build().perform();

		actions.moveToElement(driver.findElement(By.xpath("//p[text()='Bengaluru, India']"))).click().build().perform();

		driver.findElement(By.xpath("//div[contains(@aria-label,'"+date+"')]")).click();

		driver.findElement(By.xpath("//a[text()='Search']")).click();

		driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']")).click();

		JavascriptExecutor jsExecutor  = (JavascriptExecutor) driver;

		jsExecutor.executeScript("window.scrollBy(0,4000);");
//		 List<WebElement> hide = driver.findElements(By.xpath("//button[@class='button actionBtn ']"));
//		 for (WebElement Element : hide) {
//			 jsExecutor.executeScript("window.scrollInToView(true);",Element);
//			 Element.click();
//			// jsExecutor.executeScript("window.scrollBy(0,1000);");
//		}
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='blackText fontSize18 blackFont white-space-no-wrap clusterViewPrice']"));
		
        List<WebElement> brand = driver.findElements(By.xpath("//p[@class='boldFont blackText airlineName']"));
		ArrayList priceList = new ArrayList();

		for (WebElement Element : price) {
			jsExecutor  = (JavascriptExecutor) driver;
			Object allprice = jsExecutor.executeScript("return arguments[0].childNodes[0].textContent;", Element);
			String convert = allprice.toString().replace("₹ ","");
			priceList.add(convert);
			i++;
		}
	
		System.out.println("total_no_flight :"+ i);
		System.out.println();
		System.out.println("Available flight for Chennai--->Bangalore");
		for (WebElement element : brand) {
			
			System.out.println(element.getText());
			if (element.getText().contains("IndiGo")) {
				j++;
			}
			else if(element.getText().contains("Air India Express")) {
				k++;
			}
			else {
				l++;
			}
		}
		System.out.println("Lowest price ticket  :"+priceList.get(0));
		System.out.println("Highest Price ticket :"+priceList.get(priceList.size()-1));
		System.out.println("Total Indigo Flight :"+ j);
		System.out.println("Total AirIndiaExpress :"+ k);
		System.out.println("Total Air_India :"+ l);
		
		System.out.println(from_location);
		System.out.println(to_location);
	}
}
