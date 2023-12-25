package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class register_naukiri {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("testData//naukri.xlsx");

		XSSFWorkbook xlsx = new XSSFWorkbook(fis);
		
		//HSSFWorkbook xls = new HSSFWorkbook(fis);

		
		//gendralization if we dont know the file is in which format xlsx or xls
		//create respective file object
		// Workbook ref = WorkbookFactory.create(fis);

		String name = xlsx.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		String email = xlsx.getSheet("sheet1").getRow(1).getCell(0).toString();
		String password = xlsx.getSheet("sheet1").getRow(2).getCell(0).toString();
		double mobile = xlsx.getSheet("sheet1").getRow(3).getCell(0).getNumericCellValue();

		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");

		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("mobile")).sendKeys("+"+mobile+"+");
		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C://Users//suriy//OneDrive//Document 1.docx");

//		Workbook workbook = WorkbookFactory.create(fis);
		
		//Workbook workbook = new XSSFWorkbook();
//		
//		Sheet sh = workbook.getSheet("");
//		
//		Row r = sh.getRow(1);
//		
//		r.getCell(0);
		
		
		
		
		


	}
}
