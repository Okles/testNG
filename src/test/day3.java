package test;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before executing any methods in a class");

	}
	
	@Test(enabled=true)	
	@Parameters({"URL","APIKey/userName"}) //it will apply to a below SINGLE test only

	public void webLoginCarLoan(String urlName, String key)
	{
		
		//selenium
		System.out.println("Web login car");
		System.out.println(urlName);
		System.out.println(key);
		
	} 
	@BeforeMethod
	public void beforeEvery()
	{
		System.out.println("I will execute before every method in a day3 class");

	}
	
	@AfterMethod
	public void afterEvery()
	{
		System.out.println("I will execute after every method in a day3 class");

	}
	
	
	
	@Test(timeOut=(long) 0.00001)
	public void mobileLoginCarLoan()
	{
		
		//appium
		System.out.println("Mobile login car");
		
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		
		System.out.println("I am number one!");
	}
	
	
	@Test(dataProvider="getData")
	public void mobileSignInLoan(String username, String password)
	{
		
		//appium
		System.out.println("Mobile sign in");
		System.out.println(username);
		System.out.println(password);
		
	}
	

	@Test(dependsOnMethods= {"webLoginCarLoan","mobileLoginCarLoan"})

	public void mobileSignOutLoan()
	{
		
		//appium
		System.out.println("Mobile sign out");
		
	}
	@DataProvider
	public Object[][] getData()
	{
		//3 combinations of test data (3 rows) with 2 values (columns)
		Object[][] data = new Object[3][2]; //3 rows and 2 columns
		
		//1st - username and password - good credit history	
		
		data[0][0] = "Bolek";
		data[0][1] = "pass";
		
		//2nd - username and password - no credit history	
		data[1][0] = "Roman";
		data[1][1] = "passw";		
		
		//3rd - username and password - fraudelent credit history
		data[2][0] = "Zdzichu";
		data[2][1] = "password";
		
		return data;
		
	}
	

	@Test(groups= {"Smoke"})

	public void APIcarLoan()
	{
		
		//REST API automation
		System.out.println("REST of things ");
		
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Executed after running all the methods in a class");
		
	}
	

	
	
}
