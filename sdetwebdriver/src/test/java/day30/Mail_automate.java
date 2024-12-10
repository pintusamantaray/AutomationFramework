package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mail_automate {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mail.apmosys.com/webmail/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@name=\"email-address\"]")).sendKeys("rajendra.samantaray@apmosys.com");
		
		driver.findElement(By.xpath("//*[@name=\"next\"]")).click();
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Sept@2024");
		driver.findElement(By.xpath("//*[@name=\"next\"]")).click();
		
		
		
		

	}

}
