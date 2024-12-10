package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
		
	}
@FindBy(xpath="//input[@name=\"firstname\"]")
WebElement txtFirstname;

@FindBy(xpath="//input[@name=\"lastname\"]")
WebElement txtLastname;

@FindBy(xpath="//input[@name=\"email\"]")
WebElement txtEmailid;

@FindBy(xpath="//input[@name=\"password\"]")
WebElement txtPassword;

@FindBy(xpath="//input[@name=\"agree\"]")
WebElement chkdPolicy;

@FindBy(xpath="//button[@type=\"submit\"]")
WebElement btnContinue;

//@FindBy(xpath="//div[@class=\"list-group\"]/a[normalize-space()='Logout']")
//WebElement lnklogout;


public void setFirstname(String fname)
{
	txtFirstname.sendKeys(fname);
}
public void setLastname(String lname)
{
	txtLastname.sendKeys(lname);
}
public void setEmail(String email)
{
	txtEmailid.sendKeys(email);
}
public void setPassword(String pwd)
{
	txtPassword.sendKeys(pwd);
}
public void setPrivacyPolicy()
{
	chkdPolicy.click();
}
public void clickContinue()
{
	btnContinue.click();
}

//public void clickContinue()
//{
//	btnContinue.click();
//}
}
