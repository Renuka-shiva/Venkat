package com.Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_S {
	public static void main(String[] args) throws InterruptedException {
		
	

		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    String	URL="http://www.popuptest.com/goodpopups.html";
	    
         driver.get(URL);
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	    

	driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();
	
	//getWindowHandle();	
	String Window=driver.getWindowHandle();
	System.out.println("The id of WindowHandle is : "+Window);
	
	
	//getWindowHandles();
	
	Set<String>handler=driver.getWindowHandles();
	Iterator<String>it=handler.iterator();
	 String ParentId=it.next();
	 System.out.println(ParentId);
	 
	String ChildId= it.next();
	 System.out.println(ChildId);
	
	driver.switchTo().window(ChildId);
	Thread.sleep(10000);
	System.out.println(driver.getTitle());
	 
	 driver.close();
	 
	 driver.switchTo().window(ParentId);
	System.out.println(driver.getTitle());
	driver.quit();
	 
	} 
	 

}
