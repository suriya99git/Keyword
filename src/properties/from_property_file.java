package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class from_property_file {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream("testData//sample.properties");
		
		//step-2 creat respect file object
		Properties pro = new Properties();
		
		//establish connection between file 
		pro.load(fileInputStream);
		
		System.out.println(pro.getProperty("mobile"));
		System.out.println(pro.getProperty("laptop"));
		System.out.println(pro.getProperty("os"));
		
	}
}
