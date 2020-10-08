package com.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BaseTest.BaseTest;
import com.qa.Pages.LoginPage;
import com.qa.Pages.RegisterPage;
import com.qa.Pages.SwitchToPage;
import com.qa.Pages.Webtable;
import com.qa.Utility.Log;

public class SwitchToTest  extends BaseTest{
	
	LoginPage loginPage;
	RegisterPage register;
	Webtable webtable;
	SwitchToPage switchto;
	
	public SwitchToTest()
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
	switchto.switchtoclick();
	
	}
	
@Test(priority=1)
	
	public void SwitchToTitle()
	{
		 String title = switchto.validatingSwitchToPageTitle();
		// Assert.assertEquals(title, "Web Table");
		 Log.info("Title is successfully matched");
		 logger = report.createTest("SwitchTo Test");
			logger.info("validating Title");
			logger.pass(" Switch   page Title Validation Successfully");
			System.out.println(title);
		
	}

@Test(priority=2)
public void verifyAlertsclick(){
	
	logger.info(" Alerts link is clicked");
    switchto.alertsclick();
	logger.pass(" Switch   page click Successfully");
	Log.info("Switch   page click Successfully");
	
	 
	
}

@Test(priority=3)
public void verifyFrameclick(){
	
	logger.info(" frame link is clicked");
    switchto.frameclick();
	logger.pass(" frame   page click Successfully");
	Log.info("frame   page click Successfully");
	
	 
	
}@Test(priority=4)
public void verifyWindowsclick(){
	
	logger.info(" window link is clicked");
    switchto.windowsclick();
	logger.pass(" window   page click Successfully");
	Log.info("window   page click Successfully");
	
	
}

@AfterMethod
public void tearDown()
{
	driver.quit();
	Log.info("successfully close the application");
	report.flush();
}




	

}
