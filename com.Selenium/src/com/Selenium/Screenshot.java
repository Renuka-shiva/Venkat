package com.Selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    String	URL="https://www.amazon.in/";
	    
         driver.get(URL);
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	
	    
	    //Screenshot
	    
	 File  AmazonShot=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(AmazonShot, new File("./Screenshots/amazon.png"));             //Add apache.common.io.jar file to AddLibrary
	 
	 
	 
	 driver.quit();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	}
}
