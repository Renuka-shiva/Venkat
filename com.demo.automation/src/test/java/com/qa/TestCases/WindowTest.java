package com.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BaseTest.BaseTest;
import com.qa.Pages.AlertsPage;
import com.qa.Pages.FramePage;
import com.qa.Pages.LoginPage;
import com.qa.Pages.RegisterPage;
import com.qa.Pages.SwitchToPage;
import com.qa.Pages.Webtable;
import com.qa.Pages.WindowPage;
import com.qa.Utility.Log;

public class WindowTest extends BaseTest{
	LoginPage loginPage;
	RegisterPage register;
	Webtable webtable;
	SwitchToPage switchto;
	AlertsPage alertpage;
	FramePage framepage;
	WindowPage windowpage;

	public WindowTest()
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
	switchto = new SwitchToPage();
	
	alertpage = new AlertsPage();
	framepage = new FramePage();
	windowpage = new WindowPage();
	switchto.switchtoclick();
	windowpage.Window_click();
	
	
	}
@Test(priority=1)
	
	public void WindowTitle()
	{
		 String title = windowpage.validatingwindowTitle();
		// Assert.assertEquals(title, "Web Table");
		 Log.info("Title is successfully matched");
		 logger = report.createTest("window Test");
			logger.info("validating Title");
			logger.pass(" window   page Title Validation Successfully");
			System.out.println(title);
		
	}
	
	
	
	
	
	@Test(priority=2 )
	public void clicktest() throws InterruptedException
	{
		
		 windowpage.Tab1();
		 logger = report.createTest("window Test");
			logger.info("validating Title");
			logger.pass("window page Tab2 Validation Successfully");
		 windowpage.WindowHandling();
		 Log.info("Successfully Tab1 clicked");
		
		 
		
	}
	
	@Test(priority=3 )
	public void clicktest2() throws InterruptedException
	{
		
		 windowpage.Tab2();
		 logger.pass("window page Tab2 Validation Successfully");
		  
		 windowpage.WindowHandling();
		 Log.info("Successfully Tab2 clicked");
		
		 
		
	}

	@Test(priority=4)
	public void clicktest3() throws InterruptedException
	{
		
		 windowpage.Tab3();
		 windowpage.WindowHandling();
		 logger.pass("window page Tab3 Validation Successfully");
		  
		 Log.info("Successfully Tab3 clicked");
		
		 
		
	}



	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		Log.info("successfully close the application");
		report.flush();
	}







}


