package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	//Constructor is extends from base class
	public HomePage(WebDriver driver)
	{
		super(driver);
		
	}
	
//Locators
@FindBy(xpath="//a[@title=\"My Account\"]")
WebElement lnkMyaccount;
@FindBy(xpath="//a[normalize-space()='Register']")
WebElement lnkRegister;

//ActionMethos
public void clickMyAccount()
{
	lnkMyaccount.click();
}
public void clickRegister()
{
	lnkRegister.click();
}

}
