package com.TestNG;

import org.testng.annotations.Test;

public class TestNg_Features {
	
	
	@Test
	public void test1()
	{
		System.out.println(" hello Test1");
		//int i=9/0;
	}
	@Test(dependsOnMethods="test1")
	public void test2()
	{
		System.out.println(" hello Test2");
	}

	@Test(dependsOnMethods="test1")
	public void test3()
	{
		System.out.println(" hello Test3");
	}

	
	@Test(dependsOnMethods="test1")
	public void test4()
	{
		System.out.println(" hello Test4");
	}

}
