package scrmpro.appmethods.com;

import scrmpro.common.com.Connectivity;
import scrmpro.pom.com.LeadPage;

public abstract class LoginMethods extends Connectivity{
	
	public void enterUsername(String username){
		
		LeadPage.txt_username.sendKeys(username);
		
	}
	
	public void enterPassword(String password){
		LeadPage.txt_password.sendKeys(password);
	}
	
	public void clickLoginButton(){
		LeadPage.btn_login.click();
	}

}
