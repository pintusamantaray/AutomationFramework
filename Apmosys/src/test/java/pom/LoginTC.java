package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTC {
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	void testlogin()
	{
		PageLogin pl = new PageLogin(driver);
		pl.setusername("Admin");
		pl.setpassword("admin123");
		pl.click();
		
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	@AfterClass
	void teardown()
	{
		driver.quit();
	}

}
