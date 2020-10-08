package com.qa.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BaseTest.BaseTest;
import com.qa.Pages.LoginPage;
import com.qa.Pages.RegisterPage;
import com.qa.Pages.Webtable;
import com.qa.Utility.Log;

public class WebtableTest extends BaseTest {
	LoginPage loginPage;
	RegisterPage register;
	Webtable webtable;
	
	public WebtableTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void SetUp() throws InterruptedException
	{
		initialization();
	loginPage	=new LoginPage();
	register = new RegisterPage();
	register = loginPage.login(prop.getProperty("username"));
	webtable = new Webtable();
	 webtable = webtable.webtble();

	
}
	@Test(priority=1)
	
	public void WebtableTitle()
	{
		 String title = webtable.validatingWebtablePageTitle();
		 Assert.assertEquals(title, "Web Table");
		 Log.info("Title is successfully matched");
		 logger = report.createTest("WebTable Test");
			logger.info("validating Title");
			logger.pass(" WebTable LogIn page Title Validation Successfully");
			System.out.println(title);
		
	}
	


@Test(priority=2)
	
	public void Validatingdata() throws IOException
	{
		 Boolean res = webtable.validatingdata();
		// Assert.assertEquals(title, "Web Table");
		 Log.info("data is successfully matched");
		 logger = report.createTest("WebTable Test2");
			logger.info("validating data");
			logger.pass(" WebTable page data Validation Successfully");
			System.out.println(res);
			
			if(res==true)
			{
				Assert.assertTrue(true);
				logger.info("test case passed....");
				
			}
			else
			{
				logger.info("test case failed....");
				captureScreen(driver,"WebTabledata");
				Assert.assertTrue(false);
			}
				
	}
	

@AfterMethod
public void tearDown()
{
	driver.quit();
	Log.info("successfully close the application");
	report.flush();
}








}