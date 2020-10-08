package com.qa.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.BaseTest.BaseTest;

public class AlertsPage extends BaseTest {
	
	@FindBy(xpath="//*[@href='#OKTab']")
	WebElement AlertwithOK;
	
	@FindBy(xpath="//*[@href='#CancelTab']")
	WebElement AlertwithOKandCancel;
	
	@FindBy(xpath="//*[@href='#Textbox']")
	WebElement AlertwithText;
	
	
	@FindBy(xpath="//*[@onclick='alertbox()']")
	WebElement AlertwithOKBtn;
	
	@FindBy(xpath="//*[@onclick='confirmbox()']")
	WebElement AlertwithOKandCancelBtn;
	

	@FindBy(xpath="//*[@onclick='promptbox()']")
	WebElement AlertwithTextBtn;
	
	

	public AlertsPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
 public String validatingAlertsTitle()
	 
	 {
	    return driver.getTitle();
	 }
	
	
 public void alertsok()
 {
	 AlertwithOK.click();
 }
 
 public void alertsokCancel()
 {
	 AlertwithOKandCancel.click();
 }
 
 public void alertstext()
 {
	 AlertwithText.click();
 }
 
  
	 public void AlertwithOK_click() throws InterruptedException
	 
	 {
		 
		 AlertwithOKBtn.click();
		 
		 Thread.sleep(5000);
  		 Alert alert= driver.switchTo().alert(); 
  		 
  		 alert.accept();
		 
	 }
	 
 public void AlertwithOKandButton_click() throws InterruptedException
	 
	 {
	 AlertwithOKandCancelBtn.click();
	 
	 Thread.sleep(5000);
  		 Alert alert= driver.switchTo().alert(); 
  		 
  		 alert.accept();
  		// alert.dismiss();
		 
	 }
 
 public void AlertwithText_click() throws InterruptedException
 
 {
	 AlertwithTextBtn.click();
	 
	 Thread.sleep(5000);
		 Alert alert= driver.switchTo().alert(); 
		 alert.getText();
		 alert.accept();
	 
 }
}
