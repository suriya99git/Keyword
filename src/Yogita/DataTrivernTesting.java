package Yogita;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataTrivernTesting {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		for (int i = 0; i < 3; i++) {
			
		
		for (int j = 0; j < 1; i++) {
			readexcel("sheet1", i, j);
		}
		
		}
	}
	
	public static void readexcel(String sheetName,int row,int coloum) throws EncryptedDocumentException, IOException {
		
		File f = new File("testData//login.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = WorkbookFactory.create(f);
		
		Sheet s = w.getSheet(sheetName);
		
		Row r = s.getRow(row);
		
		Cell c = r.getCell(coloum);
	
		System.out.println(c.toString());
	}
}
