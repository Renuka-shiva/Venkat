package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    String	URL="https://duckduckgo.com/";
	    
         driver.get(URL);
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	    WebElement searchTextBox= driver.findElement(By.id("search_form_input_homepage"));

	 // retrieving html attribute value using getAttribute() method
	 String typeValue=searchTextBox.getAttribute("type");
	 System.out.println("Value of type attribute: "+typeValue);

	 String autocompleteValue=searchTextBox.getAttribute("autocomplete");
	 System.out.println("Value of autocomplete attribute: "+autocompleteValue);

	 // Retrieving value of attribute which does not exist
	 String nonExistingAttributeValue=searchTextBox.getAttribute("nonExistingAttribute");
	 System.out.println("Value of nonExistingAttribute attribute: "+nonExistingAttributeValue);
	 
	 
	 String data =searchTextBox.getAttribute("placeholder");
	 System.out.println(data);
	 driver.quit();
	 

	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//The getAttribute() method is declared in the WebElement interface, 
		//and it returns the value of the web element’s attribute as a string. 
		//For attributes having boolean values, the getAttribute() method will return either true or null.
		
		
		
	}

}
