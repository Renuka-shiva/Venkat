package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DataDrivenTesting {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    String	URL="http://demo.automationtesting.in/Register.html";
	    
         driver.get(URL);
          
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
	    
	    
	    FileInputStream file = new FileInputStream("C://Users//siva//Desktop//Venkat//com.Selenium//src//com//ExcelSheets//RegisterForm.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
	    
		
		int rowCount	=sheet.getLastRowNum();
		
		
		for(int i=1;i<=rowCount;i++)
		{
			Row row=sheet.getRow(i);
			
			driver.navigate().refresh();
			WebElement Firstname= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
			Firstname.clear();
			Firstname.sendKeys(row.getCell(0).getStringCellValue());
			
			 WebElement LastName= driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
			 LastName.clear();
			   LastName.sendKeys(row.getCell(1).getStringCellValue());
			   
			   WebElement Address =   driver.findElement(By.xpath("//*[@class='form-control ng-pristine ng-untouched ng-valid' and @ng-model='Adress']"));
			   Address.clear();
			   Address.sendKeys(row.getCell(2).getStringCellValue());
			   
			   WebElement Email=   driver.findElement(By.xpath("//input[@type='email' and @ng-model='EmailAdress']"));
			   Email.clear();
			   Email.sendKeys(row.getCell(3).getStringCellValue());
			   
			   
			   //typecasting
			   double d=row.getCell(4).getNumericCellValue();
				long x=(long)d;
				String phoneNumber=Long.toString(x);
				
			   WebElement Phone=   driver.findElement(By.xpath("//input[@type='tel' and @ng-model='Phone']"));
			   Phone.clear();
			   Phone.sendKeys(phoneNumber);
			   
			   
			   //RadioButtons
			   WebElement Male=   driver.findElement(By.xpath("//input[@type='radio' and @value='Male']"));	
			   WebElement FeMale=   driver.findElement(By.xpath("//input[@type='radio' and @value='FeMale']"));
			  
			   if(row.getCell(5).toString().equalsIgnoreCase("Male"))
			   {
				    
				   Male.click();
				   System.out.println("Male Button Selected");					
	        		
			   }
			   else
			   {
				   
				   FeMale.click();
				   System.out.println("FeMale Button Selected");	
			   }
			   
			  
			   
			  
			  //CheckBoxes
                 int a= driver.findElements(By.xpath("//input[@type='checkbox']")).size();
	            List <WebElement>  Checkbox= driver.findElements(By.xpath("//input[@type='checkbox']")); 
		            
	            for(int p=0;p<a;p++)
	            {
	            	 
	            	WebElement El =Checkbox.get(p);     
	                String id =El.getAttribute("value");
	                
	                if(id.equals( (row.getCell(6).toString())))
	                	
	             		   {
	                          El.click();
	                          System.out.println("CheckBox" +p+" is "+El.isSelected());  
	                          
	                           
	             		   }
	             
	            }
	         
	 		   
			   Select Skills = new Select(driver.findElement(By.id("Skills")));
			   Skills.selectByVisibleText(row.getCell(7).getStringCellValue());
			   
			   
			   Select Country = new Select(driver.findElement(By.id("countries")));
			   Country.selectByVisibleText(row.getCell(8).getStringCellValue());
			   
			   
			   double d1=row.getCell(9).getNumericCellValue();
				long x1=(long)d1;
				String yearr=Long.toString(x1);
				
			   
			   
			   Select year = new Select(driver.findElement(By.id("yearbox")));
			   year.selectByVisibleText(yearr);
			   
			   Select Month = new Select(driver.findElement(By.xpath("//select[@ng-model='monthbox']")));
			   Month.selectByVisibleText(row.getCell(10).getStringCellValue());
			   
			   
			   double d2=row.getCell(11).getNumericCellValue();
				long x2=(long)d2;
				String dayy=Long.toString(x2);
				
			   
			   
			   Select day = new Select(driver.findElement(By.id("daybox")));
			   day.selectByVisibleText(dayy);
			   
			   WebElement password=driver.findElement(By.xpath("//input[@onblur='validatepattern(this)']"));
			   password.clear();
			   password.sendKeys(row.getCell(12).getStringCellValue());
			   
			   WebElement Cpassword=driver.findElement(By.xpath("//input[@ng-model='CPassword']"));
			   Cpassword.clear();
			   Cpassword.sendKeys(row.getCell(13).getStringCellValue());
			   
			   
		    	WebElement  SignUp= driver.findElement(By.name("signup"));
		    	SignUp.click();
		    	
		    	Thread.sleep(10000);
			   
		    if(	driver.getPageSource().contains(" - Double Click on Edit Icon to "))
		    {
		    	System.out.println("SUCCESS");
		    	row.createCell(14).setCellValue("SUCCESS");
		    }
		    else
		    {
		    	System.out.println("FAILURE");
		    	row.createCell(14).setCellValue("FAILURE");
		   driver.findElement(By.xpath("//button[@id='Button1' and @value='Refresh']")).click();
  
		   
		   
	          driver.navigate().forward();
		    		 
		   
		   
		    }
		 
		    
		    FileOutputStream file1 = new FileOutputStream("C://Users//siva//Desktop//Venkat//com.Selenium//src//com//ExcelSheets//RegisterForm.xlsx");
		    workbook.write(file1);
			
			driver.navigate().back();
			
			 
		 
		} 
	    
	    
	    
	    
	    
	    driver.quit();
	
	 
	}
}
