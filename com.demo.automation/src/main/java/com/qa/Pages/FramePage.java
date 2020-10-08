package com.qa.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.qa.BaseTest.BaseTest;

public class FramePage extends BaseTest {
	
	@FindBy(id="singleframe")
	WebElement frame;
	
	@FindBy(linkText="Frames")
	WebElement frameClick;
	
	////input[@type='text']
	

	@FindBy(xpath="//input[@type='text']")
	WebElement frametextbox;
	
	//Iframe with in an Iframe
	
	@FindBy(linkText="Iframe with in an Iframe")
	WebElement IframewithinanIframe;
	
	@FindBy(xpath="//*[@src='MultipleFrames.html']")
	WebElement MultipleFrames;
	
	@FindBys(
			@FindBy(tagName="iframe"))
			public List<WebElement> frames;
	
	
	public FramePage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	 
	  public void Frame_click()
	  {
		  frameClick.click();
	  }
	  
	
 public String validatingFrameTitle()
	 
	 {
	    return driver.getTitle();
	    
	    
	 }
 
 
 public void singleframe()
 {
	 driver.switchTo().frame(frame);

 }
 
 public void frameTxtBox()
 {
	 frametextbox.sendKeys("hello");
 }
 public void defaultContent()
 {
		driver.switchTo().defaultContent();
 }
	
 public void Iframewithin_Click()
 {
	 IframewithinanIframe.click();
 }

  public void multipleframe()
  
  {
	 
	    System.out.println("Total Frames --" +frames.size());
	    
	    driver.switchTo().frame(MultipleFrames);
	    System.out.println("Total Frames --" +frames.size());
	    driver.switchTo().frame(0);
	    
	   


  }
  public void multipleframeTxtBox() throws InterruptedException
  {
	  Thread.sleep(10000);
	  frametextbox.sendKeys("hello Multiple");
  }

}
