package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.BaseTest.BaseTest;

public class LoginPage extends BaseTest {

	
	@FindBy(name="email")
	WebElement Username;
	
	@FindBy(name="pass")
	WebElement Password;
	
	@FindBy(name="login")
	WebElement Login;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String validatingLogInPageTitle()
	{
		return driver.getTitle();
		
	}
	
	public HomePage login(String uName, String pwd) throws InterruptedException
	{
		Username.sendKeys(uName);
		Password.sendKeys(pwd);
		Login.click();
		Thread.sleep(10000);
		return new HomePage();
		
	}
	
	
}
