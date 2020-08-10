package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperations {
public static void main(String[] args) throws InterruptedException {
		
		// WebDriver - its an interface in Selenium
				WebDriver driver = null;
				
				String url="http://amazon.in";
				
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
				
		driver.get(url);
		
				// Maximizing the Browser
		driver.manage().window().maximize();
		
			// Implicit wait - its a global wait - it is applicable to all the elements on
		// the webPage under Test -- if an element is found in a short duration WebDriver
		// will automated the element immediately without waiting for the rest of the time
		// to be completed -- its a Smart wait
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
						
		// id="nav-link-accountList" -- Hello SignIn Element Property
						
		WebElement helloSignIn=driver.findElement(By.id("nav-link-accountList"));
		
		Actions action = new Actions(driver);
		action.moveToElement(helloSignIn).perform();
		
	//	Thread.sleep(10000); - explicit wait
		
				// Your  Orders - Element - its a link - its a Hidden Element
		WebElement yourOrders=driver.findElement(By.linkText("Your Orders"));
		yourOrders.click();
		driver.quit();
				
	}


}
