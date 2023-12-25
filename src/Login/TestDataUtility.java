package Login;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataUtility {

	static String username;
	static String password;
	static String url;
	static {
		try {
			testData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void testData() throws IOException {

		FileInputStream fis = new FileInputStream("testData//login.xlsx");

		XSSFWorkbook xss = new XSSFWorkbook(fis);

		username = xss.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		password = xss.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		url = xss.getSheet("sheet1").getRow(2).getCell(0).getStringCellValue();
	}

}
