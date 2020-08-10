package com.Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserAutomate {
	public static void main(String[] args) {
		
	//	System.setProperty("webdriver.gecko.driver", "C://Users//siva//Desktop//Venkat//com.Selenium//driverFiles//geckodriver.exe");
	  //   FirefoxDriver driver = new FirefoxDriver();
		
	    System.setProperty("webdriver.chrome.driver", "C://Users//siva//Desktop//Venkat//com.Selenium//driverFiles//chromedriver.exe");
	     ChromeDriver driver= new ChromeDriver();
	     
	          
	 
	 String    URL = ("https://renukashiva1-trials65101.orangehrmlive.com/auth/login");
	 driver.get(URL);
	    
//		Username : Admin	//Password : Admin123
	 
	  
	 String Title=driver.getTitle();
	 System.out.println(Title);
	    
	    String CurrentUrl= driver.getCurrentUrl();
	    System.out.println(CurrentUrl);
	    
	    
		driver.quit();
		
		
		
	 
		 
		
		
		
	}

}
