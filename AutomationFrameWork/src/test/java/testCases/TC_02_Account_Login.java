package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pageObjects.Account_Login;
import pageObjects.HomePage;

public class TC_02_Account_Login extends BaseClass{

@Test
public void login()
{
	HomePage hp= new HomePage(driver);
	hp.clickMyAccount();
	
	Account_Login al= new Account_Login(driver);
	al.clickbtnlogin();
	al.entermailid("abcdapm2@gmail.com");
	al.enterpasswd("Jamukoli@1");
	al.clinkonlogin();
	
	String confmsg =al.confmsg();
	assertEquals(confmsg, "My Account");
	
			
}
}
