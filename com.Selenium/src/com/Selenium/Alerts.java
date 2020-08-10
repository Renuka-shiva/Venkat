package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;

public class Alerts {
public static void main(String[] args) throws InterruptedException {
		

	WebDriver driver = null;		
	 System.setProperty("webdriver.chrome.driver", "C://Users//siva//Desktop//Venkat//com.Selenium//driverFiles//chromedriver.exe");
     driver= new ChromeDriver();
     
	String url="https://www.tsrtconline.in";
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	
	
	driver.findElement(By.id("searchBtn")).click();;
	
	
	Alert alert = driver.switchTo().alert();
	String	text=alert.getText();
	System.out.println(text);
		alert.accept();
	driver.quit();
	 
	}

 

}


 
