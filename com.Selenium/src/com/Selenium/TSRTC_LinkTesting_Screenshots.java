package com.Selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_LinkTesting_Screenshots {
public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    String	URL="https://www.tsrtconline.in/oprs-web/";
    
     driver.get(URL);
    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

	
		List<WebElement>links=driver.findElements(By.tagName("a")); 
		
		int linksCount=links.size();// getting the size of the Elements stored in "links" 
		
System.out.println("The total number of links on the Amazon logIn Page are :"+linksCount);

// getting all the linkNames found on the WebPage

for(int i=0;i<linksCount;i++)//to goto every index of ArrayList(links) and getting the text
	{
		String linkName=links.get(i).getText(); // goes to index and gets the text
		System.out.println(i+" "+linkName);// printing the linkName
		
		links.get(i).click();  // navigates to next WebPage
		
	    
		 File  AmazonShot=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(AmazonShot, new File("./Screenshots/TSRTC/"+"image"+i+".png"));             //Add apache.common.io.jar file to AddLibrary
		 

		
		System.out.println(driver.getTitle()); // getting the title of the next Page
System.out.println(driver.getCurrentUrl()); // getting the currentUrl of the next Page
System.out.println();
		
		driver.navigate().back(); // Coming back to Previous WebPage
		
		// Re-creating the arrayList to store all the elements of Type links
//since the driver focus is moved to the next page - the stored info in the ArrayList(Links)
		// will be cleared/ it gets Empty - restoring the values back into the ArrayList
		links=driver.findElements(By.tagName("a"));
		
	}	
					  // org.openqa.selenium.ElementNotInteractableException:
		driver.quit();
		
	}

}


 