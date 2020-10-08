package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.BaseTest.BaseTest;

public class SwitchToPage extends BaseTest {
	
	
	@FindBy(linkText="SwitchTo")
	WebElement switchto;
	
	@FindBy(linkText="Alerts")
	WebElement alerts;
	

	@FindBy(linkText="Windows")
	WebElement windows;
	
	@FindBy(linkText="Frames")
	WebElement frames;
	
	
	
	
	
	public SwitchToPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
 
	 public SwitchToPage switchtoclick()
	 {
		 switchto.click();
		return new SwitchToPage();
	 }
	 
	 public String validatingSwitchToPageTitle()
		{
			return driver.getTitle();
			
		}
	 

	 public AlertsPage alertsclick()
	 {
		  
		 Actions act = new Actions(driver);
		 act.moveToElement(alerts).build().perform();
		 alerts.click();
		 
		 return new AlertsPage();
	 }
	 
	 public WindowPage windowsclick()
	 {
		 Actions act = new Actions(driver);
		 act.moveToElement(windows).build().perform();
		 windows.click();
		 
		 return new WindowPage();
	 }
	 
	 public FramePage frameclick()
	 {
		 Actions act = new Actions(driver);
		 act.moveToElement(frames).build().perform();
		 frames.click();
		 
		 return new FramePage();
	 }
	

}
