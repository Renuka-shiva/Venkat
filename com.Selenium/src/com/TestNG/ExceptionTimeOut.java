package com.TestNG;

import org.testng.annotations.Test;

public class ExceptionTimeOut {
	
//	@Test(timeOut=2)
//	public void Hello()
//	{
//		int i=1;
//		while(i==1)
//		{
//			System.out.println(i);
//		}
//		 
//	}
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void Hi()
	{
		String d ="HELLO123";
		Integer.parseInt(d);
	}
	
	

}
