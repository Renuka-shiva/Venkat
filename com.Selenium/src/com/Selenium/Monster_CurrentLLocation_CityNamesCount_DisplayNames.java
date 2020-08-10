package com.Selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

public class Monster_CurrentLLocation_CityNamesCount_DisplayNames {
public static void main(String[] args) throws IOException {
		
		WebDriver driver = null;
		String url="https://my.monsterindia.com/sponsered_popup.html";
				
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
				
		driver.get(url);

				// Maximizing the Browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// identifying the dropDown "current location"
		// class="border_grey1" - property of Current location
		WebElement currentLocation=driver.findElement(By.className("border_grey1"));
		 
		// finding all Elements in the DropDown - Current Location - using "option" tag
List<WebElement>currentLocationElements=currentLocation.findElements(By.tagName("option"));

int currentLocationElements_Count=currentLocationElements.size();

System.out.println(" The number of elements in the current location dropDown are : "+currentLocationElements_Count);

for(int i=0;i<currentLocationElements_Count;i++)
{
	String currentLocationElementName=currentLocationElements.get(i).getText();
	System.out.println(currentLocationElementName);
}
		
		FileInputStream file = new FileInputStream
				("C://Users//siva//Desktop//Venkat//com.Selenium//src//com//Selenium//DropDown.xlsx");
      XSSFWorkbook workBook = new XSSFWorkbook(file); 
      XSSFSheet sheet = workBook.getSheet("Sheet1");
		 
		for(int i=0;i<currentLocationElements_Count;i++)
		{
			Row row=sheet.createRow(i);
			org.apache.poi.ss.usermodel.Cell cell=  row.createCell(0);
						
			if(currentLocationElements.get(i).isDisplayed())
			{
				String currentLocationElementName=currentLocationElements.get(i).getText();
				System.out.println(currentLocationElementName);
				
				((org.apache.poi.ss.usermodel.Cell) cell).setCellValue(currentLocationElementName);
			}
			
		}
		
		FileOutputStream file1 = new FileOutputStream
								("C://Users//siva//Desktop//Venkat//com.Selenium//src//com//Selenium//DropDown.xlsx");
		workBook.write(file1);
	

		driver.quit();

}
}