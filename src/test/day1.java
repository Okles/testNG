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
	
<<<<<<< HEAD
	@AfterSuite(groups= {"Smoke"})
=======
	@AfterSuite
>>>>>>> 0128cc722e9049ab27c365843ff00a07ce2191f5
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
