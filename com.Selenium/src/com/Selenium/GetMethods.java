package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	public static void main(String[] args) {
		
		//getLocation() : Element is where on the page.
		//getSize() : It Returns width and height of the element.
		//getTagName() : It gets the tag name of the current element.
		//getText() : It gets visible text for an element.
		
		
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    String	URL="https://google.com";
	    
         driver.get(URL);
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	    
	    
	    WebElement sigin = driver.findElement(By.id("gb_70"));
		
	    
	    //getLocation() WebElement method
		Point location = sigin.getLocation();
		System.out.println("Location of X :"+ location.getX()+ "," +"Location of Y :" +location.getY());
		
		//getSize() WebElement method
		Dimension size = sigin.getSize();
		System.out.println("Width :"+size.getWidth()+ "," +"Height : "+size.getHeight());
		
		//getText() WebElement method
		String text = sigin.getText();
		System.out.println("Text :" +text);
		
		//getTagName() WebElement method
		String tagName = sigin.getTagName();
		System.out.println("Tagname :"+tagName);
		
		
		
		//driver.findElement(By.cssSelector("input#fakebox-input")).sendKeys("hello");
		
		
		//close the browser
		driver.close();

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
