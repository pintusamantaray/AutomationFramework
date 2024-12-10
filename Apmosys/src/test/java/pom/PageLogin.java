package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageLogin {
	
	WebDriver driver;
	//Constructor
	PageLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	//Locator
	By usernameloc=By.xpath("//input[@placeholder=\"Username\"]");
	By passwordloc=By.xpath("//input[@name=\"password\"]");
	By clicklogin=By.xpath("//button[@type=\"submit\"]");
	//Action Methods
	public void setusername(String user)
	{
		driver.findElement(usernameloc).sendKeys(user);
	}
	public void setpassword(String pwd)
	{
		driver.findElement(passwordloc).sendKeys(pwd);
	}
	public void click()
	{
		driver.findElement(clicklogin).click();
	}
	
	
}
