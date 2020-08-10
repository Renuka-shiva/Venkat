package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng_grouping {
	WebDriver driver;
	 
	    
	
	 
	
	@BeforeMethod  
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		  driver = new ChromeDriver();
	    String	URL="https://www.google.com/";
	    
         driver.get(URL);
          
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
	    

	}
	

	@Test (priority=1,groups="Url") 
	public void CurrentUrl ()
	{
		String CurrentUrl= driver.getCurrentUrl();
	    System.out.println(CurrentUrl);
	} 
	
	@Test (priority=2,groups="Title")
	public void GoogleTitle ()
	{
		 String Title=driver.getTitle();
		 System.out.println(Title);
		    
	} 
	
	@Test(priority=3,groups="getText") 
	public void getText1()
	{
	    WebElement getText2=driver.findElement(By.id("hplogo"));
	   System.out.println(getText2.isDisplayed()); 
	 //  System.out.println(getText2.getText()); ;
	}
	
	 
	@Test(priority=4,groups="Test") 
	public void Gmail()
	{
	  Boolean d = driver.findElement(By.linkText("Gmail")).isDisplayed();
	  System.out.println(d);
	}
	
	@Test(priority=5,groups="Test") 
	public void GoogleSearch()
	{
		 System.out.println("test1");
	}
	
	@Test(priority=6,groups="Test") 
	public void Test2()
	{
		 System.out.println("test2");
	}
	
	
	
	
	
	@AfterMethod  
	public void TearDown()
	{
		driver.quit();
		System.out.println("Logout from app");
	}
	
 
	
	
 


}
