package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions act = new Actions(driver);
		
		WebElement rome=driver.findElement(By.xpath("//div[@id=\"box6\"]"));
		WebElement Italy= driver.findElement(By.xpath("//div[@id=\"box106\"]"));
		
		
		WebElement madrid = driver.findElement(By.xpath("//*[@id=\"box7\"]"));
		WebElement Spain = driver.findElement(By.xpath("//*[@id=\"box107\"]"));
		
		act.dragAndDrop(rome, Italy);
		act.dragAndDrop(madrid, Spain).build().perform();
		
		WebElement washington =driver.findElement(By.xpath("//*[@id=\"box3\"]"));
		WebElement US= driver.findElement(By.xpath("//*[@id=\"box103\"]"));
		
		act.dragAndDrop(washington, US).perform();
		
		Thread.sleep(5000);
		
		WebElement washington1 =driver.findElement(By.xpath("//*[@id=\"box3\"]"));
		WebElement capitals=driver.findElement(By.xpath("//*[@id=\"capitals\"]"));
		
		act.dragAndDrop(washington1, capitals).perform();
		
		
	}

}
