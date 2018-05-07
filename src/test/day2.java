package test;

import org.testng.annotations.BeforeTest;
<<<<<<< HEAD
import org.testng.annotations.Parameters;
=======
>>>>>>> 0128cc722e9049ab27c365843ff00a07ce2191f5
import org.testng.annotations.Test;

public class day2 {

	//using a parameter
	@Parameters({"URL"}) //it will apply to a below SINGLE test only
	@Test(groups= {"Smoke"})
	public void ploan(String urlName)
	{
		//selenium
		System.out.println("Personal Loan");
		System.out.println(urlName);
	} 
	
	@BeforeTest
	public void prerequisite()
	{
		
<<<<<<< HEAD
=======
	} 
	
	@BeforeTest
	public void prerequisite()
	{
		
>>>>>>> 0128cc722e9049ab27c365843ff00a07ce2191f5
		System.out.println("I will execute first");
	}
	
}
