package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button =driver.findElement(By.xpath("//*[@class=\"context-menu-one btn btn-neutral\"]"));
		
		
		Actions act = new Actions(driver);
		act.contextClick(button).perform();
		
		driver.findElement(By.xpath("//*[@class=\"context-menu-item context-menu-icon context-menu-icon-copy\"]")).click();
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		

	}

}
