package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Homepage extends BasePage {
		
		public Homepage(WebDriver driver)
		{
			super (driver);
		}
		
@FindBy(xpath="//span[normalize-space()='My Account']")
WebElement lnkMyAccount;

@FindBy(xpath="//a[@href='https://demo.opencart.com/en-gb?route=account/register']")
WebElement lnkRegister;

public void clickMyAccount()
{
	lnkMyAccount.click();
}
public void clickRegister()
{
	lnkRegister.click();
}
	}

