package Yogita;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkingWithExcelData {

	public static Object[][] multipleData(String sheetname) throws EncryptedDocumentException, IOException {
		
		File f = new File("testData//register.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheetname);
		
		int rowsize = s.getPhysicalNumberOfRows();
		int coloumsize = s.getRow(0).getPhysicalNumberOfCells();
		
		Object[][]data = new Object[rowsize-1][coloumsize];
		
		for (int i = 0; i < rowsize-1; i++) {
			for (int j = 0; j < coloumsize; j++) {
				data[i][j]= s.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
	}
}
