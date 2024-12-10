package data_driven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		try
			{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
			driver.manage().window().maximize();
			Thread.sleep(3000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,300)");  // Scrolls down 300 pixels
			String filepath=System.getProperty("user.dir")+"/testdata/MoneyControl.xlsx";
		
			int row=Utilities.getrowcount(filepath,"Sheet1");
		
			for (int i=1;i<=row;i++)
			{
			//Read data from excel
				String principle=Utilities.getcelldata(filepath, "Sheet1", i, 0);
				String rateofinterest=Utilities.getcelldata(filepath, "Sheet1", i, 1);
				String period1=Utilities.getcelldata(filepath, "Sheet1", i, 2);
				String period2=Utilities.getcelldata(filepath, "Sheet1", i, 3);
				String freq=Utilities.getcelldata(filepath, "Sheet1", i, 4);
				String exp_matval=Utilities.getcelldata(filepath, "Sheet1", i, 5);
			
				//Pass above data into application
				driver.findElement(By.xpath("//input[@id=\"principal\"]")).sendKeys(principle);
				driver.findElement(By.xpath("//input[@id=\"interest\"]")).sendKeys(rateofinterest);
				driver.findElement(By.xpath("//input[@id=\"tenure\"]")).sendKeys(period1);
				
				Select perdrp=new Select(driver.findElement(By.xpath("//select[@id=\"tenurePeriod\"]")));
				perdrp.selectByVisibleText(period2);
			
				Select frqdrp=new Select(driver.findElement(By.xpath("//select[@id=\"frequency\"]")));
				frqdrp.selectByVisibleText(freq);
				
				driver.findElement(By.xpath("(//div[@class=\"CTR PT15\"]/a)[1]")).click();
				
				
				//Validation
			
				String act_mvalue=driver.findElement(By.xpath("//span[@id=\"resp_matval\"]/strong")).getText();
				
				if (Double.parseDouble(exp_matval)==Double.parseDouble(act_mvalue))
				{
					System.out.println("Test is Passed");
					Utilities.setcelldata(filepath, "Sheet1", i, 7,"Passed");
				}
				else
				{
					System.out.println("Test is Failed");
					Utilities.setcelldata(filepath, "Sheet1", i, 7,"Failed");
				}
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@class=\"CTR PT15\"]//a[2]")).click();
			}
		}finally {
			driver.quit();
		}
		

	}

}
