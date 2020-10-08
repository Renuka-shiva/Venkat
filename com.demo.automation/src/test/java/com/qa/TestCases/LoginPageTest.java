package com.qa.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BaseTest.BaseTest;
import com.qa.Pages.LoginPage;
import com.qa.Utility.Log;

public class LoginPageTest extends BaseTest {
	
	LoginPage loginPage;
	public LoginPageTest(){
		super();
	}

	
	@BeforeMethod
	public void SetUp()
	{
		initialization();
	loginPage	=new LoginPage();
		
	}
	
	
	@Test(priority=1)
	public void LoginPageTitle() throws IOException
	{
		 String title =loginPage.validatingLogInPageTitle();
		 
		 Log.info("Title is successfully matched");
		 logger = report.createTest("LogInPage Test");
			logger.info("validating Title");
			logger.pass("LogIn page Title Validation Successfully");
			
			
			if(title.contains("Index"))
			{
				Assert.assertTrue(true);
				Assert.assertEquals(title, "Index");
				logger.info("test case passed....");
				
			}
			else
			{
				logger.info("test case failed....");
				captureScreen(driver,"LoginPage");
				Assert.assertTrue(false);
			}
		
	}
	
	@Test(priority=2)
	
	public void loginTest() throws InterruptedException
	{
		loginPage.login(prop.getProperty("username"));
		Log.info("successfully login" );
	}
		
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		Log.info("successfully close the application");
		report.flush();
	}
	
	

	
	
}
