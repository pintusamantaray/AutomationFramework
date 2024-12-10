package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		WebElement button=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(button);
		
	}

}
