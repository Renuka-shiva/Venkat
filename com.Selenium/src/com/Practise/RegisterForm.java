package com.Practise;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterForm {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    String	URL="http://demo.automationtesting.in/Register.html";
	    
         driver.get(URL);
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	    
	    
	    
	   WebElement Firstname= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	   Firstname.sendKeys("Renuka");
	   
	   WebElement LastName= driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	   LastName.sendKeys("Mohan");
	   
	   WebElement Address =   driver.findElement(By.xpath("//*[@class='form-control ng-pristine ng-untouched ng-valid' and @ng-model='Adress']"));
	   Address.sendKeys("Madhapur");
	   
	   WebElement Email=   driver.findElement(By.xpath("//input[@type='email' and @ng-model='EmailAdress']"));
	   Email.sendKeys("renu@gmail.com");
	   
	   WebElement Phone=   driver.findElement(By.xpath("//input[@type='tel' and @ng-model='Phone']"));
	   Phone.sendKeys("7013622475");
	   
	   
	   WebElement Male=   driver.findElement(By.xpath("//input[@value='Male']"));
	   Male.click();
	   
	   WebElement FeMale=   driver.findElement(By.xpath("//input[@value='FeMale']"));
	   FeMale.click();
	   
	   
	   WebElement Cricket=   driver.findElement(By.xpath("//input[@value='Cricket']"));
	   Cricket.click();
	   
	   WebElement Movies=   driver.findElement(By.xpath("//input[@value='Movies']"));
	   Movies.click();
	   
	   
	   WebElement Hockey=   driver.findElement(By.xpath("//input[@value='Hockey']"));
	   Hockey.click();
	   
	   Select Skills = new Select(driver.findElement(By.id("Skills")));
	   Skills.selectByVisibleText("Java");
	   
	   
	   Select Country = new Select(driver.findElement(By.id("countries")));
	   Country.selectByVisibleText("India");
	   
	   
	   Select year = new Select(driver.findElement(By.id("yearbox")));
	   year.selectByVisibleText("1992");
	   
	   Select Month = new Select(driver.findElement(By.xpath("//select[@ng-model='monthbox']")));
	   Month.selectByVisibleText("February");
	   
	   Select day = new Select(driver.findElement(By.id("daybox")));
	   day.selectByVisibleText("16");
	   
	   WebElement password=driver.findElement(By.xpath("//input[@onblur='validatepattern(this)']"));
	   password.sendKeys("Renuka123");
	   
	   WebElement Cpassword=driver.findElement(By.xpath("//input[@ng-model='CPassword']"));
	   Cpassword.sendKeys("Renuka123");
	   
	   
    	WebElement  SignUp= driver.findElement(By.name("signup"));
    	SignUp.click();
    	
    	Thread.sleep(10000);
	   
    if(	driver.getPageSource().contains(" - Double Click on Edit Icon to "))
    {
    	System.out.println("SUCCESS");
    }
    else
    {
    	System.out.println("FAILURE");
    }
    
    driver.quit();
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	    
	    

}}
