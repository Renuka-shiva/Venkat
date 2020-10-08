package com.qa.Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.BaseTest.BaseTest;

public class WindowPage extends BaseTest {
	
	@FindBy(linkText="Windows")
	WebElement Windows;
	
	
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")
	WebElement Tab1;
	@FindBy(xpath="//*[@id='Tabbed']/a/button")
	WebElement Tab1Click;
	
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")
	WebElement Tab2;
	@FindBy(xpath="//*[@id='Seperate']/button")
	WebElement Tab2Click;
	 
	@FindBy(xpath="/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")
	WebElement Tab3;
	@FindBy(xpath="//*[@id='Multiple']/button")
	WebElement Tab3Click;
	
	
	 
	
	public WindowPage()
	{
		PageFactory.initElements(driver, this);
		
	}
 public String validatingwindowTitle()
	 
	 {
	    return driver.getTitle();
	 }
	public void Window_click()
	{
		Windows.click();
	}
	
	public void Tab1() throws InterruptedException
	{
		Tab1.click();
		 Tab1Click.click();
		 System.out.println(driver.getTitle());

	}
	
	public void Tab2()
	
	{
		Tab2.click();
		Tab2Click.click();
		 System.out.println(driver.getTitle());
		
	}
	
	
	
	
	
public void Tab3()
	
	{
		Tab3.click();
		Tab3Click.click();
		 System.out.println(driver.getTitle());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void WindowHandling() throws InterruptedException
	{
		
		Set<String> s = driver.getWindowHandles();

		for(String i:s)
		{
			 String t =driver.switchTo().window(i).getTitle();
			 System.out.println(i       + "      " +         t);
			 
			 
			 
		}

		Iterator<String>it=s.iterator();
		String ParentId=it.next();
		System.out.println(ParentId);

		String ChildId= it.next();
		System.out.println(ChildId);

		driver.switchTo().window(ChildId);
		Thread.sleep(10000);
		System.out.println(driver.getTitle());

		driver.close();

		driver.switchTo().window(ParentId);
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
