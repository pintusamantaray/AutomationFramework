package day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prac_dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//frame1
		WebElement frame1= driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//*[@name=\"mytext1\"]")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent();
		
		//frame2
		
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("Automation");
		driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//iframe[@src=\"https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true\"]"));
		driver.findElement(By.xpath("(//div[@class=\"bzfPab wFGF8\"])[2]")).click();
		driver.findElement(By.xpath("(//div[@class=\"bzfPab wFGF8\"])[4]")).click();
		
		WebElement choiceoption = driver.findElement(By.xpath("//*[@class=\"MocG8c HZ3kWc mhLiyf LMgvRb KKjvXb DEh1R\"]"));
		Select choice = new Select(choiceoption);
		choice.selectByVisibleText("Well, now I know :-)");
		
		driver.findElement(By.xpath("//*[@aria-selected=\"true\"]")).click();
		
		driver.findElement(By.xpath("//*[@jsname=\"OCpkoe\"]")).click();
		
		driver.findElement(By.xpath("//input[@class=\"whsOnd zHQkBf\"]")).sendKeys("Hello");
		driver.findElement(By.xpath("//*[@class=\"KHxj8b tL9Q4c\"]")).sendKeys("ThankYou");
		driver.findElement(By.xpath("(//div[@role=\"button\"])[2]")).click();
		
		driver.switchTo().defaultContent();
		
		//driver.get("https://testautomationpractice.blogspot.com/");
		
		
		

	}

}
