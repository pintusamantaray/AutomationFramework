package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		//frame1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
		driver.switchTo().frame(frame1); //passed frame as a web element
		driver.findElement(By.xpath("//*[@name=\"mytext1\"]")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent();  //this is the default syntax to go to the main frame
		
		//frame2
		WebElement frame2=driver.findElement(By.xpath("//*[@src=\"frame_2.html\"]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("Success");
		
		driver.switchTo().defaultContent();  
		
		//frame3
		WebElement frame3=driver.findElement(By.xpath("//*[@src=\"frame_3.html\"]"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("iframetask");
		
		//to do operation in frame inside frame3 no need to go to the main frame.
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
		driver.findElement(By.xpath("")).click();
		
		
		
		
		
	}

}
