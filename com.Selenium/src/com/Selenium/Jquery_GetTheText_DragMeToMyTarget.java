package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery_GetTheText_DragMeToMyTarget {
	public static void main(String[] args) {
		
		WebDriver driver = null;
				
				String url="https://jqueryui.com/droppable/";
				
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
				
		driver.get(url);

				// Maximizing the Browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Identify the property of Frame of the Webpage in which Element is under Test
		// <iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));


		// id="draggable" - property of "Drag Me to My Target" Element

		WebElement dragMeToMyTargetElement=driver.findElement(By.id("draggable"));
		String dragMeToMyTargetElementText=dragMeToMyTargetElement.getText();

		System.out.println(" The text of the WebElement is : "+dragMeToMyTargetElementText);
		WebElement droppable=	driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(dragMeToMyTargetElement, droppable).build().perform();;
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Resizable")).click();;


	}

}
