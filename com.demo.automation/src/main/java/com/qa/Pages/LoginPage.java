package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.BaseTest.BaseTest;

public class LoginPage extends BaseTest {
	
	
	@FindBy(id="email")
	WebElement Username;
	
	 
	
	@FindBy(id="enterimg")
	WebElement enterBtn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String validatingLogInPageTitle()
	{
		return driver.getTitle();
		
	}
	
	public RegisterPage login(String uName ) throws InterruptedException
	{
		Username.sendKeys(uName);
		enterBtn.click();
		 
		return new RegisterPage();
	}
	
	

}
