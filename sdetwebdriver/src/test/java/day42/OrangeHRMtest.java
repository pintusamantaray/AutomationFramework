package day42;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMtest {
	WebDriver driver;
	@Test(priority=1)
	void openapp()
	{
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
				
	}
	@Test(priority=2)
	void testlogo()
	{
//		Thread.sleep(3000);
		boolean status=driver.findElement(By.xpath("//img[@src=\"/web/images/ohrm_branding.png?v=1721393199309\"]")).isDisplayed();
		System.out.println("logo displayed is...." +status);
	}
	@Test(priority=3)
	void login()
	{
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	}
	@Test(priority=4)
	void closeapp()
	{
		driver.close();
	}
}
