package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pageObjects.ApmosysMailLogin;
import pageObjects.ApmosysPassword;


public class TC_ApmosysLogin extends ApmosysBaseClass {

	
	@Test
	public void logintest()
	{
		ApmosysMailLogin login = new ApmosysMailLogin(driver);
		login.enterMail("rajendra.samantaray@apmosys.com");
		login.clicknext();
		
		ApmosysPassword psswd = new ApmosysPassword(driver);
		psswd.enterPwd("Sept@2024");
		psswd.clickSignin();
	
		String confmsg = psswd.msgveryfy();
		assertEquals(confmsg, "rajendra samantaray");
	
				
	}
	

}
