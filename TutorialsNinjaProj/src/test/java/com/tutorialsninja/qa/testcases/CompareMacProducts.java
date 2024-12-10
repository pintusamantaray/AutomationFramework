package com.tutorialsninja.qa.testcases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CompareMacProducts {
	
	WebDriver driver = new ChromeDriver();
	
	@BeforeClass
	public void setup()
	{
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void compareMac()
	{
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("mac");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);");
		
		List<WebElement> productPrices = driver.findElements(By.xpath("//span[@class=\"price-tax\"]"));
		
		List<Double> prices = new ArrayList<>();
        for (WebElement priceElement : productPrices) {
        	String priceText = priceElement.getText(); // Get the entire price text
            String[] parts = priceText.split(" "); // Split by space
            String numericPriceText = parts[0].replace("$", "");
            prices.add(Double.parseDouble(numericPriceText));
        }
        double minPrice = prices.stream().min(Double::compare).orElse(0.0);
        double maxPrice = prices.stream().max(Double::compare).orElse(0.0);
        
        System.out.println("Minimum Price: $" + minPrice);
        System.out.println("Maximum Price: $" + maxPrice);

	}
	
	@AfterClass
	public void tearDown()
	{
		//driver.quit();
	}
	
}
