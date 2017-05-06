package scrmpro.testcases.com;

import org.testng.annotations.Test;

import scrmpro.appmethods.com.LoginMethods;

public class LoginTestCases extends LoginMethods{
  
	@Test
	public void validLogin(){
		enterUsername("ceo");
		enterPassword("Oracle@345_user");
		clickLoginButton();
	}
}
