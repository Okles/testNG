package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
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
		
		System.out.println("I will execute first");
	}
	
}
