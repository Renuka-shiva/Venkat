package com.Practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    String	URL="https://www.flipkart.com/";
	    
         driver.get(URL);
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	    
	    
	    //1------  //html[@attribute='']
	    driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	    
	    
	    //2------  //*[@attribute='']
	    driver.findElement(By.xpath("//*[@class='LM6RPg']")).sendKeys("redmi");
	    
	    
	    //3------ //html[@attribute='' and @attribute='']
	    driver.findElement(By.xpath("//button[@class='vh79eN' and @type='submit']")).click();
	    
	    //4----- //html[text()='']
	   driver.findElement(By.xpath("//div[text()='Redmi 8 (Onyx Black, 64 GB)']")).click();
	   
	   
	    //-------//input[@placeholder='Enter Delivery Pincode']
	   
	   // [text()[contains(.,'Enter Delivery Pincode')]]
	   
	   
	   
	   //#rso > div:nth-child(2) > div > div.r > a > h3
	   ////*[@id="rso"]/div[2]/div/div[1]/a/h3
	   
	   ///html/body/div[5]/div[2]/div[9]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/a/h3
	   
	   
		 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
    }

	     
	     
	     
	
	
	
	
	
	
	
	
	
	
	
	

}
