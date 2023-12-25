package practice;

import java.io.IOException;

import org.testng.annotations.Test;

import Login.LoginUtility;

public class Test_Login {

	@Test
	public void login() throws IOException {
		
		LoginUtility.login();	
	}
	
	
}
