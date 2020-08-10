package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_LogInPage_LinksCount_DisplayNamesOfLinks {
public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		
		// <a href="mercurysignon.php">SIGN-ON</a>
		// <a href="mercuryregister.php">REGISTER</a>
		// <a href="mercuryunderconst.php">SUPPORT</a>
		// <input type="text" name="userName" size="10">
		
// Whenever we want to work with multiple Elements on the Webpage then should use
//	findElements() method
	
		List<WebElement>links=driver.findElements(By.tagName("a")); 
// the Type of elements to be found are of Type links - using the common property as tag-'a'
// Since an Element is getting saved into "links" - its a WebElement
// Since more than one Element is getting saved into "links" - it should be List( which is
// dynamic - can save with more Values ) - it should be declared as List<WebELement>		
		
		int linksCount=links.size();// getting the size of the Elements stored in "links" 
		
System.out.println("The total number of links on the NewTours logIn Page are :"+linksCount);

// getting all the linkNames found on the WebPage

for(int i=0;i<linksCount;i++)//to goto every index of ArrayList(links) and getting the text
	{
		String linkName=links.get(i).getText(); // goes to index and gets the text
		System.out.println(i+" "+linkName);// printing the linkName
	}	
					
		driver.quit();
		
		
}}

 
