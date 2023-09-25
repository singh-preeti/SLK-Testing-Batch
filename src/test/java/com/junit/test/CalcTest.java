package com.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTest {
	// Before and @After
	@BeforeClass
	public static void setUpForAll()
	{
		System.out.println("setting resources for all!");
	}
	@Before
	public void setUp()
	{
		System.out.println("setting up and allocating the required resources!");
	}
	Calculator calc = new Calculator();
	@Test
	public void addTest()
	{
		assertEquals(7,calc.add(2,5));
	}
	@Test
	public void subTest()
	{
		assertEquals(10,calc.sub(20,10));
	}
	
		// why assertEquals method is static?
		
	@After
	public void tearDown()
	{
		System.out.println("Deallocating the resources so that it can be used somewhere else!");
	}
		
	@AfterClass
	public static  void destroyAll()
	{
		System.out.println("Dellocating the resources afetr execution of all the test cases!");
	}

}
