package com.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InvocationCount {
	
 
	@Test(invocationCount=10)
	public void sum()
	{
		int a=12;
		int b=25;
		int c;
		c=a+b;
		System.out.println(" The sum is ...." + c);
	}

//	
//	@DataProvider(name="loginDataprovider")
//	public Object[][] getData()
//	{
//		Object[][] data ={{"abc@gmail.com","abc"},{"xyz@gmail.com","xyz"},{"hello@gmail.com","hello"}};
//		return data;
//		
//	}
}
