package day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	WebDriver driver;
	
	@BeforeClass
	void login()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider = "dp")
	void testlogin(String email, String pwd)
	{
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.findElement(By.xpath("(//a[@class=\"dropdown-toggle\"][normalize-space()='My Account'])")).click();
		driver.findElement(By.xpath("(//*[@class=\"dropdown-menu dropdown-menu-right\"]//a[normalize-space()='Login'])")).click();
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]")).isDisplayed();
		driver.findElement(By.xpath("(//a[@href=\"https://tutorialsninja.com/demo/index.php?route=product/category&path=25\"])[1]")).click();
		driver.findElement(By.xpath("//a[@href=\"https://tutorialsninja.com/demo/index.php?route=product/category&path=25_28\"]")).click();
		driver.findElement(By.xpath("//img[@src=\"https://tutorialsninja.com/demo/image/cache/catalog/demo/apple_cinema_30-228x228.jpg\"]")).click();
		
	}
	@AfterClass
	void logout()
	{
		//driver.quit();
	}
	
	@DataProvider(name ="dp")
	Object[][] loginData()
	{
		Object data [][]= {
				{"abcd@gmail.com","As@123"},
				{"kmln@gmail.com","Uqwer@123"},
				{"apmtestauto@gmail.com","Apm@123"},
				//{"qwerty@gmail.com","Apm@123"}
				
		};
		return data;
	}
	

}
