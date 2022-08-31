package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectmodel.LoginpageObject;
import Resources.Baseclass;

public class VerifyLoginTestcase extends Baseclass{
 
	@Test
	public void login() throws IOException {
		
		browserLaunch();
		driver.get("https://login.salesforce.com/?locale=in");
		
		LoginpageObject lpo=new LoginpageObject();
		lpo.Enterpassword().sendKeys("rahul");
		lpo.Enterpassword().sendKeys("123");
		lpo.Clicklogin().click();
		
	}
}
