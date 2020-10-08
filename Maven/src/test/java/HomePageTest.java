import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BaseTest.BaseTest;
import com.qa.Pages.HomePage;
import com.qa.Pages.LoginPage;
import com.qa.Utility.Log;

public class HomePageTest extends BaseTest{
	
	
	LoginPage loginPage;
	HomePage homepage;
	
	public HomePageTest()
	{
		super();
		
	}
	
	@BeforeMethod
	public void SetUp() throws InterruptedException
	{
		initialization();
	  loginPage	=new LoginPage();
	 homepage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	
	 Log.info("successfully login" );
	
	}
	
	@Test(priority=1)
	public void validatinghomepageTitle()
	{
		 String title =homepage.homePageTitle();
		 Assert.assertEquals(title, "Facebook");
		 Log.info("Home Title is successfully matched");
		 logger = report.createTest("HomePage Test");
			logger.info("Home Page validating Title");
			logger.pass("Home page Title Validation Successfully");
		

	}
	
	 
	@AfterMethod
	public void tearDown()
	{
		report.flush();
		driver.quit();
		Log.info("successfully close the application");
	}
	
 
	
	

}
