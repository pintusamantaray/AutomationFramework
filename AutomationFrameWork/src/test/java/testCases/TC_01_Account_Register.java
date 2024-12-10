package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pageObjects.AccountRegister;
import pageObjects.HomePage;

public class TC_01_Account_Register extends BaseClass{

	
	@Test
	public void verify_account_registretion()
	{
		HomePage hp= new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegister accreg= new AccountRegister(driver);
		accreg.enterFirstName("Sipun");
		accreg.enterLastName("Rana");
		accreg.enterEmail("abcdapm21@gmail.com");
		accreg.enterTelephone("7009213245");
		accreg.enterPwd("Jamukoli@1");
		accreg.enterCnfPwd("Jamukoli@1");
		accreg.clickPrivacyPolicy();
		accreg.clickBtnContinue();
		
		String confmsg=accreg.getConfMsg();
		assertEquals(confmsg , "Your Account Has Been Created!");
	}

}
