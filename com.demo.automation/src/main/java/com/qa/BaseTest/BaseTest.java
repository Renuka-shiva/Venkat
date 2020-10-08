package com.qa.BaseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTest {
	
	
	public  static WebDriver driver;
	public static Properties prop;
	public static ExtentReports report;
	public static ExtentTest logger;
	
 public BaseTest(){	
 try{
	
     
	FileInputStream file = new FileInputStream("C://Users//siva//Desktop//Venkat//com.demo.automation//src//main//java//com//qa//config//config.properties");
	prop = new Properties();
	prop.load(file);
	
	
	
 } catch (FileNotFoundException e){
	 e.printStackTrace();
	
	
} catch (IOException e){
	e.printStackTrace();
}
	
 }
	

 public static void initialization()
 {
	 
	 
		
		String browserName= prop.getProperty("browser");
		
		
		
		if(browserName.equals("chrome"))
		{
			  System.setProperty("webdriver.chrome.driver", "C://Users//siva//Desktop//Venkat//com.demo.automation//driverFiles//chromedriver.exe");
			      driver= new ChromeDriver();
			     
		}else if(browserName.equals("FF"))
		{
			driver = new FirefoxDriver();
			
		}
		
		
		
		driver.get(prop.getProperty("url"));
		   driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		    driver.navigate().refresh();
		     
		    
 }
 
 public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

	@BeforeSuite
	public void setUpSuite()
	{
		ExtentHtmlReporter extent = new ExtentHtmlReporter("./Reports/demoautomation.html");
		report = new ExtentReports();
		report.attachReporter(extent);
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
