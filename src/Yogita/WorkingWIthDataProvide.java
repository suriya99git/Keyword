package Yogita;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class WorkingWIthDataProvide {

	@Test(dataProvider = "loginData")
	public void login(String username,String gender) {
		
		Reporter.log(username);
		Reporter.log(gender);
	}
	
	@DataProvider(name = "loginData")
	public Object[][] data() throws EncryptedDocumentException, IOException{
		
//		Object[][] data = new Object[2][2];
//		
//		data[0][0] = "username1";
//		data[0][1] = "password1";
//		data[1][0] = "username2";
//		data[1][1] = "password2";
		
		return WorkingWithExcelData.multipleData("sheet1");
	}
	
}
