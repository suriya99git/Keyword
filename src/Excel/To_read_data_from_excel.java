package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class To_read_data_from_excel {

	public static void main(String[] args) throws IOException {
		//create Input stream object
		FileInputStream fis = new FileInputStream("testData//tes.xlsx");
		//gendralization
		//create respective file object
		//Workbook ref = WorkbookFactory.create(fis);
		XSSFWorkbook xlsx = new XSSFWorkbook(fis); 
		//HSSFWorkbook xls = new HSSFWorkbook(fis);

		double number = xlsx.getSheet("sheet1").getRow(0).getCell(0).getNumericCellValue();

		System.out.println(number);

		String string_data = xlsx.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(string_data);
		boolean boolean_data = xlsx.getSheet("sheet1").getRow(2).getCell(0).getBooleanCellValue();
		System.out.println(boolean_data);
		Date date_detial = xlsx.getSheet("sheet1").getRow(3).getCell(0).getDateCellValue();
		System.out.println(date_detial);
	}
}
