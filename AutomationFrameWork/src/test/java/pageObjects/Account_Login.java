package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Account_Login extends BasePage{

	public Account_Login(WebDriver driver) 
	{
		super(driver);
	}
@FindBy(xpath="//*[@class=\"dropdown-menu dropdown-menu-right\"]//a[normalize-space()='Login']")
WebElement login;
@FindBy(xpath="//input[@name='email']")
WebElement txtmailid;
@FindBy(xpath="//input[@name='password']")
WebElement txtPasswd;
@FindBy(xpath="//input[@type=\"submit\"]")
WebElement btnlogin;
@FindBy(xpath="//div[@id=\"content\"]//h2[normalize-space()='My Account']")
WebElement cnfmsg;

public void clickbtnlogin()
{
	login.click();
}
public void entermailid(String mailid)
{
	txtmailid.sendKeys(mailid);
}
public void enterpasswd(String passwd)
{
	txtPasswd.sendKeys(passwd);
}
public void clinkonlogin()
{
	btnlogin.click();
}
public String confmsg()
{
	try{
		return(cnfmsg.getText());
	}
	catch(Exception e) {
		return(e.getMessage());
	}
	
}
}
