package oHRM_LogInTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_LogInTest {
public static void main(String[] args) throws InterruptedException {
		
		// WebDriver - its an interface in Selenium
		WebDriver driver = null;
		
		String url="https://renukashiva1-trials65101.orangehrmlive.com/auth/login";
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
			
		// <input name="txtUsername" id="txtUsername" type="text">
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		// <input name="txtPassword" id="txtPassword" type="password">
WebElement password=driver.findElement(By.name("txtPassword")); // identifying an element 
 // with the property and saving into a "variable" with a meaningful name
// Since we are saving an element into a "variable" - it should be declared as WebElement
// WebElement is an Interface of Selenium WebDriver
// WebElement acts like a dataType
		 
		 password.sendKeys("Admin123"); // Using the "variable" in which the WebElement is
	// saved - Performing an Operation on it
		 
	// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		 WebElement logInButton=driver.findElement(By.className("button"));
		 logInButton.click();
	
		
		 String exptected_HomePageText="Admin";
		 System.out.println(" The expected Text of HomePage after LogIn is : "+exptected_HomePageText);
		 
		 
		 //<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		 WebElement welComeAdminElement=driver.findElement(By.id("welcome"));
		 String actual_HomePageElementText=welComeAdminElement.getText();
		 
		 System.out.println(" The actualElement text of HomePage is : "+actual_HomePageElementText);
		 
		 if(actual_HomePageElementText.contains(exptected_HomePageText))
		 {
			 System.out.println(" LogIn Successfull - PASS");
		 }
		 else
		 {
			 System.out.println(" LogIn Failed - FAIL");
		 }
		 
		 welComeAdminElement.click();
		 
		 Thread.sleep(10000); // explicit waitq
		 
		 // <a href="/orangehrm-4.0/symfony/web/index.php/auth/logout">Logout</a>
		 WebElement logOut=driver.findElement(By.linkText("Logout"));
		 logOut.click();
		 
	}

 

}
