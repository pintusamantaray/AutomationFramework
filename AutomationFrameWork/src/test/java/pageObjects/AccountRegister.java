package pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegister extends BasePage{

	public AccountRegister(WebDriver driver) 
	{
		super(driver);
	}
	
@FindBy(xpath="//input[@name=\"firstname\"]")
WebElement firstname;
@FindBy(xpath="//input[@name=\"lastname\"]")
WebElement lastname;
@FindBy(xpath="//input[@name=\"email\"]")
WebElement email;
@FindBy(xpath="//input[@name=\"telephone\"]")
WebElement telephone;
@FindBy(xpath="//input[@name=\"password\"]")
WebElement password;
@FindBy(xpath="//input[@name=\"confirm\"]")
WebElement cnfPassword;
@FindBy(xpath="//input[@name='agree']")
WebElement privacyPolicy;
@FindBy(xpath="//input[@type='submit']")
WebElement btnContinue;
@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
WebElement verifylogin;

public void enterFirstName(String fname)
{
	firstname.sendKeys(fname);
}
public void enterLastName(String lname)
{
	lastname.sendKeys(lname);
}
public void enterEmail(String emailid)
{
	email.sendKeys(emailid);
}
public void enterTelephone(String phone)
{
	telephone.sendKeys(phone);
}
public void enterPwd(String pwd)
{
	password.sendKeys(pwd);
}
public void enterCnfPwd(String cnfpwd)
{
	cnfPassword.sendKeys(cnfpwd);
}
public void clickPrivacyPolicy()
{
	privacyPolicy.click();
}
public void clickBtnContinue()
{
	btnContinue.click();
}
public String getConfMsg()
{
	try {
		return(verifylogin.getText());
	} catch (Exception e) {
		return(e.getMessage());
	}
}
}
