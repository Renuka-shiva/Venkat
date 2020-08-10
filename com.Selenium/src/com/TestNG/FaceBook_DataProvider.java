package com.TestNG;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Testutil.TestFB;
import com.Testutil.TestUtility;

public class FaceBook_DataProvider {
        
	WebDriver driver;
	
	
	@BeforeMethod
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		  driver = new ChromeDriver();
	    String	URL="https://www.facebook.com/";
	    
        
          
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
	    driver.get(URL);
	    
	    
	}
	

	@DataProvider(name="testData")
    public Object[][] testDataFeed() throws IOException
    {
 
		Object  [][] data = TestFB.getTestdataMethod();
		 
	return data;
       
    }
	
	
	@Test(dataProvider="testData")
	public void fb_login(String email,String pwd){
		
		
		driver.findElement(By.id("email")).clear();
		    driver.findElement(By.id("email")).sendKeys(email);
		    
		    
		   driver.findElement(By.id("pass")).clear(); 	    
		   driver.findElement(By.id("pass")).sendKeys(pwd);
		   
		   driver.findElement(By.xpath("//input[@value='Log In']")).click();
		   
		 
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
