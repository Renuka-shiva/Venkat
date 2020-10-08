package com.qa.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.BaseTest.BaseTest;
import com.qa.Pages.LoginPage;
import com.qa.Pages.RegisterPage;
import com.qa.Utility.Log;
import com.qa.Utility.TestUtility;

public class RegisterTest extends BaseTest{
	
	private static final String Status = null;
	LoginPage loginPage;
	RegisterPage register;
	
	public RegisterTest()
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
	 Log.info("Register logIn is successfully matched");
	}
	
	
	@Test(priority=1)
	
	public void RegisterTitle() throws IOException
	{
		 String title =register.verifyRegisterPageTitle();
		
		 
		 logger = report.createTest("RegisterPage Test");
			logger.info("validating Title");
			logger.pass(" Register LogIn page Title Validation Successfully");
			
			if(title.contains("Register"))
			{
				Assert.assertTrue(true);
				Assert.assertEquals(title, "Register");
				logger.info("test case passed....");
				 Assert.assertEquals(title, "Register");
				 Log.info("Title is successfully matched");
				
			}
			else
			{
				logger.info("test case failed....");
				captureScreen(driver,"RegisterPage");
				Assert.assertTrue(false);
			}
		
		
	}
	
	@DataProvider (name="getRegisterdata")
	public Object[][] getRegisterdata() throws IOException
	{
		
		Object data[][] = TestUtility.getTestdata("Sheet1");
		return data;
		
	}
	
	
	
	
	
	
	@Test(priority=2, dataProvider="getRegisterdata")
	
	public void  validateNewRegister(String firstname,String lastName,String address,String email,String phone,
			String Radio,String checkbox,String skills,String country,String Year,String month,String Day,String Pwd
			,String CPwd,String status ) throws InterruptedException, IOException
	
	{
		

       
		  logger.info("New register Creation");
		  loginPage.login(prop.getProperty("username"));
		  driver.navigate().refresh();		
		  
		 // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			 
		  
		  register.createRegister(firstname, lastName, address, email, phone, Radio, checkbox, skills, country, Year, month, Day, Pwd, CPwd, status );
		  logger.pass("new Register Successfully");
		  Log.info("new Register Successfully");
		  
		  
		boolean Result= driver.getPageSource().contains(" - Double Click on Edit Icon to ");
		  if(Result ==true)
		    {
		    	
			  Assert.assertTrue(true);
				 
				logger.info("test case passed....");
				
			}
			else
			{
				logger.info("test case failed....");
				captureScreen(driver,"RegisterPage");
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
