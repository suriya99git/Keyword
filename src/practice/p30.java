package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class p30 {

	@Test(dataProvider = "testdata")
	public void testCase1(String username) {
		
		System.out.println(username);
		//System.out.println(no);
	}
	
	@DataProvider(name="testdata")
			public Object data() throws EncryptedDocumentException, IOException {
		
		  FileInputStream fis = new FileInputStream("C:\\Users\\suriy\\Downloads\\practice.xlsx");
		  Workbook wb = WorkbookFactory.create(fis);
		  Sheet s = wb.getSheet("sheet1");
		  int row = s.getPhysicalNumberOfRows();
		  int coloumn = s.getRow(0).getPhysicalNumberOfCells();
		  Object[]d = new Object[row];
		  for (int i = 0; i < row; i++) {
			//for (int j = 0; j < coloumn; j++) {
				
				d[i]= s.getRow(i).getCell(0).toString(); 
			//}
		}
//		  d[0][0] = "suriya";
//		  d[0][1] = "99";
//		  d[1][0] = "johnson";
//		  d[1][1] = "100";
//		  
		  return d;
		
	}
}
