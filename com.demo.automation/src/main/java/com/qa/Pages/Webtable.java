package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.BaseTest.BaseTest;

public class Webtable extends BaseTest {
	
	
	@FindBy(linkText="WebTable")
	WebElement webtable;
	
	
	public Webtable()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	 public Webtable webtble()
	 {
		 webtable.click();
		return new Webtable();
	 }

	public String validatingWebtablePageTitle()
	{
		return driver.getTitle();
		
	}
	
	public boolean validatingdata()
	{
		return driver.getPageSource().contains("- Double Click on Edit Icon to EDIT the Table Row.");
	}
	
	

}
