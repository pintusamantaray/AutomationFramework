package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApmosysPassword extends BasePage{

	public ApmosysPassword(WebDriver driver) 
	{
		super(driver);
		
	}
	
@FindBy(xpath="//input[@name='password']")
WebElement txtpwd;
@FindBy(xpath="//button[@name='next']")
WebElement btnsignin;
@FindBy(xpath="//div[@class='ico root_private']//b[contains(text(),'rajendra samantaray')]")
WebElement verifymsg;

public void enterPwd(String pwd)
{
	txtpwd.sendKeys(pwd);
}
public void clickSignin()
{
	btnsignin.click();
}
public String msgveryfy()
{
	try {
		return(verifymsg.getText());
	} catch (Exception e) {
		return(e.getMessage());
	}
	
}

}
