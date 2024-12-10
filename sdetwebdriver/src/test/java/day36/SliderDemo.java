package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		Actions act =new Actions(driver);
		
		WebElement min_slider=driver.findElement(By.xpath("(//*[@class=\"ui-slider-handle ui-corner-all ui-state-default\"])[1]"));
		
		System.out.println("Default location of the slideris:"+min_slider.getLocation()); // (59, 289)
		
		act.dragAndDropBy(min_slider, 200, 126).perform();
		
		System.out.println("Value after the movement is :"+min_slider.getLocation());
		
		
		WebElement max_slider = driver.findElement(By.xpath("(//*[@class=\"ui-slider-handle ui-corner-all ui-state-default\"])[2]"));
		System.out.println("Default location of the max slider is:"+max_slider.getLocation());
		
		act.dragAndDropBy(max_slider, -100, 126).perform();
		System.out.println("The value is:"+max_slider.getLocation());
		

	}

}
