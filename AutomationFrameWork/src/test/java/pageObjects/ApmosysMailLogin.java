package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApmosysMailLogin extends BasePage {

	public ApmosysMailLogin(WebDriver driver) 
	{
		super(driver);
	}
	
@FindBy(xpath="//input[@name=\"email-address\"]")
WebElement txtmailid;
@FindBy(xpath="//button[@name='next']")
WebElement btnnext;

public void enterMail(String mail)
{
	txtmailid.sendKeys(mail);
}
public void clicknext()
{
	btnnext.click();
}

}
