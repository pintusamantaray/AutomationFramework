package com.tutorialsninja.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Search {
	
	WebDriver driver = new ChromeDriver();
	
	@BeforeClass
	public void setup()
	{
		driver.get("https://tutorialsninja.com/demo/");
	}
	

	@Test
	public void verifySearchWithValidProduct()
	{
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("HP");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		
		Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
		
	}
	@Test
	public void verifySearchwithnonExistingProduct()
	{
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("macen");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		
		String actualMsg=driver.findElement(By.xpath("//p[contains(text(),'There is no product that matches the search criteria.')]")).getText();
		Assert.assertEquals(actualMsg,"There is no product that matches the search criteria.","Expected ErrorMsg not found");
	}
	
	@AfterClass
	public void teardown()
	{
		//driver.quit();
	}

}
