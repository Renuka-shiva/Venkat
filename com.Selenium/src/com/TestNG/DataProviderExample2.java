package com.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample2 {
	
	
	@Test(dataProvider="loginDataprovider")
	public void Logintest(String email,String pwd)
	{
		System.out.println(email + "    "+ pwd);
	}
	
	
	@DataProvider(name="loginDataprovider")
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		
		//1st row
		data[0][0]="hello";
		data[0][1]="pandi";
		
		//2nd row
		data[1][0]="hi";
		data[1][1]="idiot";
		
		//3rd row
		data[2][0]="Bye";
		data[2][1]="rascal";
		
		
		
		
		
		
		
		
		
		
		return data;
		
	}
	 
	

}
