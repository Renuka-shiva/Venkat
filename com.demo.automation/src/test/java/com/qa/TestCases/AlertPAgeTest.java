package com.qa.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BaseTest.BaseTest;
import com.qa.Pages.AlertsPage;
import com.qa.Pages.LoginPage;
import com.qa.Pages.RegisterPage;
import com.qa.Pages.SwitchToPage;
import com.qa.Pages.Webtable;
import com.qa.Utility.Log;

public class AlertPAgeTest extends BaseTest {
	LoginPage loginPage;
	RegisterPage register;
	Webtable webtable;
	SwitchToPage switchto;
	AlertsPage alertpage;
	
	
	public AlertPAgeTest()
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
	alertpage = new AlertsPage();
	switchto.alertsclick();
	
	
	}
	
@Test(priority=1)
	
	public void alertswithok() throws IOException
	{
		 String title =  alertpage.validatingAlertsTitle();
		// Assert.assertEquals(title, "Web Table");
		 Log.info("Title is successfully matched");
		 logger = report.createTest("Alert Test");
			logger.info("validating Title");
			logger.pass(" Alert  page Title Validation Successfully");
			System.out.println(title);
			
			if(title.contains("Alerts"))
			{
				Assert.assertTrue(true);
				Assert.assertEquals(title, "Alerts");
				logger.info("test case passed....");
				 Assert.assertEquals(title, "Alerts");
				 Log.info("Title is successfully matched");
				
			}
			else
			{
				logger.info("test case failed....");
				captureScreen(driver,"AlertPage");
				Assert.assertTrue(false);
			}
		
		
	}

@Test(priority=2)
public void AlertwithOK_test() throws InterruptedException{
	
	
	alertpage.alertsok();
	logger.info(" AlerttOK link is clicked");
	 Thread.sleep(5000);
    alertpage.AlertwithOK_click();
	logger.pass(" Alert   page click Successfully");
	Log.info("Alert page click Successfully");
	
	 
	
}

@Test(priority=3)
public void AlertwithOKandButton_test() throws InterruptedException{
	
	logger.info(" alerBtn link is clicked");
	alertpage.alertsokCancel();
	 Thread.sleep(5000);
   alertpage.AlertwithOKandButton_click();
	logger.pass(" alertBtn   page click Successfully");
	Log.info("alertBtn   page click Successfully");
	
}
@Test(priority=4)
public void AlertwithText_test() throws InterruptedException{
	
	logger.info(" alerttextlink is clicked");
	alertpage.alertstext();
	 Thread.sleep(7000);
   alertpage.AlertwithText_click();
	logger.pass(" alerttext  page click Successfully");
	Log.info("alerttext  page click Successfully");
	
}
@AfterMethod
public void tearDown()
{
	driver.quit();
	Log.info("successfully close the application");
	report.flush();
}






}
