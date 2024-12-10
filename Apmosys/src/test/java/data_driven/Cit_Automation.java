package data_driven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cit_Automation {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		driver.manage().window().maximize();
		
		String filepath=System.getProperty("user.dir")+"/testdata/CitAutomation.xlsx";
		int row=Utilities.getrowcount(filepath,"Sheet1");
		
		for(int i=0; i<=row;i++)
		{
			String depamt=Utilities.getcelldata(filepath, "Sheet1", i, 0);
			String intrate=Utilities.getcelldata(filepath, "Sheet1", i, 1);
			String len=Utilities.getcelldata(filepath, "Sheet1", i, 2);
			String comp=Utilities.getcelldata(filepath, "Sheet1", i, 3);
			String tot=Utilities.getcelldata(filepath, "Sheet1", i, 4);
			
			driver.findElement(By.xpath("//input[@formcontrolname=\"cdAmount\"]")).clear();
			driver.findElement(By.xpath("//input[@formcontrolname=\"cdLength\"]")).clear();
			driver.findElement(By.xpath("//input[@formcontrolname=\"cdRate\"]")).clear();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@formcontrolname=\"cdAmount\"]")).sendKeys(depamt);
			
			
			driver.findElement(By.xpath("//input[@formcontrolname=\"cdLength\"]")).sendKeys(len);
			
			
			driver.findElement(By.xpath("//input[@formcontrolname=\"cdRate\"]")).sendKeys(intrate);
			
//			Select comdrp=new Select(driver.findElement(By.xpath("//mat-select[@id=\"mat-select-0\"]")));
//			comdrp.selectByVisibleText(comp);
			
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			
			String worth=driver.findElement(By.xpath("(//div[@id=\"validResults\"]/p/span)[4]")).getText();
			if (Double.parseDouble(tot)==Double.parseDouble(worth))
			{
				System.out.println("Test is Passed");
				Utilities.setcelldata(filepath, "Sheet1",i,6,"Passed");
			}
			else
			{
				System.out.println("Test is Failed");
				Utilities.setcelldata(filepath, "Sheet1",i,6,"Passed");
			}
				
				
			
		}

	}

}
