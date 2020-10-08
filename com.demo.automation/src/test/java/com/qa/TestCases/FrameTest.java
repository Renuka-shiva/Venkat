package com.qa.TestCases;

import java.io.IOException;

import org.testng.Assert;
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
import com.qa.Utility.Log;

public class FrameTest extends BaseTest{

	LoginPage loginPage;
	RegisterPage register;
	Webtable webtable;
	SwitchToPage switchto;
	AlertsPage alertpage;
	FramePage framepage;
	
	
	public FrameTest()
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
	framepage = new FramePage();
	framepage.Frame_click();
	
	
	}
	
@Test(priority=1,enabled=false)
	
	public void frameclick() throws IOException
	{
		 String title =  framepage.validatingFrameTitle();
		// Assert.assertEquals(title, "Web Table");
		 Log.info("Title is successfully matched");
		 logger = report.createTest("Frame Test");
			logger.info("validating Title");
			logger.pass("Frame page Title Validation Successfully");
			System.out.println(title);
			
			if(title.contains("Frames"))
			{
				Assert.assertTrue(true);
				Assert.assertEquals(title, "Frames");
				logger.info("test case passed....");
				 Assert.assertEquals(title, "Frames");
				 Log.info("Title is successfully matched");
				
			}
			else
			{
				logger.info("test case failed....");
				captureScreen(driver,"FramePage");
				Assert.assertTrue(false);
			}
		
		
	}

@Test(priority=2,enabled=false)
public void FrameText() throws InterruptedException{
	framepage.singleframe();
	logger.info(" singleframe link is clicked");
	framepage.frameTxtBox();
	 framepage.defaultContent();
	 logger.pass(" Frame   page click Successfully");
		Log.info("Frame page click Successfully");
		
	
	 
}


@Test(priority=3)
public void iframewithinframe()
{
	
	 framepage.Iframewithin_Click();
	 logger.info(" Iframewithin_Click link is clicked");
	 Log.info("Iframewithin_Click page click Successfully");
		
	 framepage.multipleframe();
	 
	 framepage.defaultContent();
	
	
}

@AfterMethod
public void tearDown()
{
	driver.quit();
	Log.info("successfully close the application");
	report.flush();
}

}
