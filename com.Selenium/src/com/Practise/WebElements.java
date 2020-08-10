package com.Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    String	URL="https://www.amazon.in/";
	    
	    driver.get(URL);
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	    
	    
	    
	    driver.findElement(By.name("field-keywords")).sendKeys("redmi 7a");
	    Thread.sleep(3000);
	    driver.findElement(By.className("nav-input")).click();
	    Thread.sleep(3000);;
	    
	    ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)", "");
//	   Boolean CheckBox= driver.findElement(By.className("a-icon a-icon-checkbox")).isSelected();
//	   
//	   System.out.println(CheckBox);
//	   driver.findElement(By.className("a-icon a-icon-checkbox")).click();
//	   
 driver.findElement(By.linkText("Fashionury")).click();

	    Thread.sleep(3000);
	    
	    //<span class="a-size-medium a-color-base a-text-normal" dir="auto">Fashionury Krishna Designer Printed Soft Silicone Mobile Case Back Cover for Redmi 7A/ Designer Back Cover for Xiaomi Redmi 7A</span>
	    driver.findElement(By.partialLinkText("Fashionury Krishna Designer Printed ")).click();
	    
	    Thread.sleep(10000);
	    driver.switchTo().frame(driver.findElement(By.className("a-box-inner")));
	    
	     WebElement quality=driver.findElement(By.id("quantity"));
	     
	    
	    Select quality1 =new Select(quality);
	    quality1.selectByValue("3");
	    
	    
	    
	 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
