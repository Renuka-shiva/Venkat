package com.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	//@Test(dataProvider="loginDataprovider",dataProviderClass=InvocationCount.class)
	
	
	@Test(dataProvider="loginDataprovider")
	public void Logintest(String email,String pwd)
	{
		System.out.println(email + "    "+ pwd);
	}
	
	@DataProvider(name="loginDataprovider")
	public Object[][] getData()
	{
		Object[][] data ={{"abc@gmail.com","abc"},{"xyz@gmail.com","xyz"},{"hello@gmail.com","hello"}};
		return data;
		
	}
	 
	
	
}
