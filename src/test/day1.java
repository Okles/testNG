package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {

	@AfterTest
	public void lastExecution()
	{
		System.out.println("I will execute last");
		
	}
	@Test
	public void Demo()
	{
		 
		System.out.println("Demo");
		 
	}
	

	@AfterSuite(groups= {"Smoke"})

	public void afterSuite()
	{
		System.out.println("I am the last :(");
	}
	
	@Test
	public void secondTest()
	{
		
		System.out.println("Test 2");
	}

}
