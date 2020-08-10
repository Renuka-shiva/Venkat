package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_CurrentLocation_Selection {
public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="https://my.monsterindia.com/sponsered_popup.html";
				
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
				
		driver.get(url);

				// Maximizing the Browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// identifying the dropDown "current location"
		// class="border_grey1" - property of Current location
		WebElement currentLocation=driver.findElement(By.className("border_grey1"));

		// Selecting an Optional values from the DropDown(Current Location)
		
		Select currentLocationselection = new Select(currentLocation);
	
		currentLocationselection.selectByIndex(4);
		currentLocationselection.selectByValue("491");
		currentLocationselection.selectByVisibleText("Hyderabad / Secunderabad");
		
		// Selecting optional values from Industry DropDown 
		// id="id_industry" - property of industry Element
		
		WebElement industry=driver.findElement(By.id("id_industry"));
		Select selection_IdustryElement = new Select(industry); 
		
		selection_IdustryElement.selectByIndex(1);
		selection_IdustryElement.selectByValue("4");
	selection_IdustryElement.selectByVisibleText("Banking/Accounting/Financial Services");

		/*selection_IdustryElement.deselectByIndex(2);
		selection_IdustryElement.deselectByValue("5");
		selection_IdustryElement.deselectByVisibleText("Any");
		*/
		
		selection_IdustryElement.deselectAll();
		driver.quit();
		
	}
 

}
