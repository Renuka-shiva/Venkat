package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.BaseTest.BaseTest;

public class HomePage extends BaseTest {
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div[1]/div[2]/div[4]/div[1]/div[4]/a/span/span")
	WebElement loginlabel;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String homePageTitle()
	{
		return driver.getTitle();
	}

}
