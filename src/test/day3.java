package test;

<<<<<<< HEAD
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
=======
import org.testng.annotations.AfterMethod;
>>>>>>> 0128cc722e9049ab27c365843ff00a07ce2191f5
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before executing any methods in a class");

	}
	
	@Test
	public void webLoginCarLoan()
	{
		
		//selenium
		System.out.println("Web login car");
		
	} 
	@BeforeMethod
	public void beforeEvery()
	{
		System.out.println("I will execute before every method in a day3 class");
<<<<<<< HEAD
=======
	}
	
	@AfterMethod
	public void afterEvery()
	{
		System.out.println("I will execute after every method in a day3 class");
>>>>>>> 0128cc722e9049ab27c365843ff00a07ce2191f5
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
	
	
	
<<<<<<< HEAD
	@Test(enabled=false)
=======
	@Test
>>>>>>> 0128cc722e9049ab27c365843ff00a07ce2191f5
	public void mobileSignInLoan()
	{
		
		//appium
		System.out.println("Mobile sign in");
		
	}
	
<<<<<<< HEAD
	@Test(dependsOnMethods= {"webLoginCarLoan","mobileLoginCarLoan"})
=======
	@Test
>>>>>>> 0128cc722e9049ab27c365843ff00a07ce2191f5
	public void mobileSignOutLoan()
	{
		
		//appium
		System.out.println("Mobile sign out");
		
	}
	
	
<<<<<<< HEAD
	@Test(groups= {"Smoke"})
=======
	@Test
>>>>>>> 0128cc722e9049ab27c365843ff00a07ce2191f5
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
