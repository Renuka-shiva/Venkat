package com.qa.Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.BaseTest.BaseTest;

public class RegisterPage extends BaseTest{
	
	@FindBy(xpath=("//*[@id='basicBootstrapForm']/div[1]/div[1]/input"))
	WebElement Firstname;
	
	@FindBy(xpath=("//input[@placeholder='Last Name']"))
	WebElement LastName;
	
	@FindBy(xpath=("//*[@class='form-control ng-pristine ng-untouched ng-valid' and @ng-model='Adress']"))
	WebElement Address;
	
	@FindBy(xpath=("//input[@type='email' and @ng-model='EmailAdress']"))
	WebElement Email;
	
	@FindBy(xpath=("//input[@type='tel' and @ng-model='Phone']"))
	WebElement Phone;
	
	@FindBys(
			@FindBy(xpath="//input[@name='radiooptions'])"))
			public List<WebElement> radio;
	@FindBys(
			@FindBy(xpath="//input[@type='checkbox']"))
			public List<WebElement> Checkbox;
	
	@FindBy(id=("Skills"))
	WebElement Skills;
	
	@FindBy(id=("countries"))
	WebElement Country;
	
	@FindBy(id=("yearbox"))
	WebElement year;
	
	@FindBy(xpath=("//select[@ng-model='monthbox']"))
	WebElement Month;
	
	
	@FindBy(id=("daybox"))
	WebElement day;
	
	@FindBy(xpath=("//input[@onblur='validatepattern(this)']"))
	WebElement password;
	
	@FindBy(xpath=("//input[@ng-model='CPassword']"))
	WebElement Cpassword;
	
	@FindBy(name=("signup"))
	WebElement Signup;
	
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyRegisterPageTitle()
	{
		return driver.getTitle();
		
	}
	
	
	public void createRegister(String firstname,String lastName,String address,String email,String phone,
			String Radio,String checkbox,String skills,String country,String Year,String month,String Day,String Pwd
			,String CPwd,String status
			) throws InterruptedException
	{
		
		  Thread.sleep(10000);
			
		 Firstname.sendKeys(firstname);
		 LastName.sendKeys(lastName);
		 Address.sendKeys(address);
		 Email.sendKeys(email);
		 Phone.sendKeys(phone);
		
		 //radio 
		 for(int j=0;j<radio.size();j++)
		   {
			   WebElement rd= radio.get(j);
			   String id2=rd.getAttribute("value");
			   if (id2.equals(Radio))
			   {
				   rd.click();
				   System.out.println("Radio"+ j + "is" + rd.isSelected());
			   }
		   }
		 
		 //checkboxes
		  for(int p=0;p<Checkbox.size();p++)
          {
          	 
          	WebElement El =Checkbox.get(p);     
              String id =El.getAttribute("value");
               if(id.equals(checkbox  ))
              	
           		   {
                        El.click();
                        System.out.println("CheckBox" +p+" is "+El.isSelected());  
                        
                         
           		   }
          }
		  
		  
		  Select Skills = new Select(driver.findElement(By.id("Skills")));
		   Skills.selectByVisibleText(skills);
		   
		   Select Country = new Select(driver.findElement(By.id("countries")));
		   Country.selectByVisibleText(country);
		   
		   
		   Select year = new Select(driver.findElement(By.id("yearbox")));
		   year.selectByVisibleText(Year);
		   
		   Select Month = new Select(driver.findElement(By.xpath("//select[@ng-model='monthbox']")));
		   Month.selectByVisibleText(month);
		   
		   Select day = new Select(driver.findElement(By.id("daybox")));
		   day.selectByVisibleText(Day);
		   
		   password.sendKeys(Pwd);
		   Cpassword.sendKeys(CPwd);
		   
		   Signup.click();
		   
			
		   driver.navigate().forward();
		   
		   
		 

	}
	
	
	
	

}
