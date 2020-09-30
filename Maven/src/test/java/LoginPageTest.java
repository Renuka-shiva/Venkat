import org.codehaus.plexus.logging.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.qa.BaseTest.BaseTest;
import com.qa.Pages.LoginPage;
import com.qa.Utility.Log;

public class LoginPageTest extends BaseTest{
	
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
	public void LoginPageTitle()
	{
		 String title =loginPage.validatingLogInPageTitle();
		 Assert.assertEquals(title, "Facebook – log in or sign up");
		 Log.info("Title is successfully matched");
		 logger = report.createTest("LogInPage Test");
			logger.info("validating Title");
			logger.pass("LogIn page Title Validation Successfully");
		
	}
	
	@Test(priority=2)
	
	public void loginTest() throws InterruptedException
	{
		loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
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
