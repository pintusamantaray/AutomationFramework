package day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drpodown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='country']"));
		//3 methos are there for select dropdown
		
		Select drpCountry= new Select(drpCountryEle);
		
		//drpCountry.selectByVisibleText("India"); //select by visible text
		drpCountry.selectByValue("germany"); //select by value

	}

}
