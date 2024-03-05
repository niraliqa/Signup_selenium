package class50_testng;

import org.testng.annotations.Test;

public class FirstTestNgTest2 
{
	@Test(priority = 1)
	public void logintest()
	{
		System.out.println("login done");
	}
	
	@Test(priority = 2)
	public void createcourses()
	{
		System.out.println("course created");
	}
	
	
	@Test(priority = 2)
	public void createcategory()
	{
		System.out.println("category created");
	}
	
	@Test(priority = 4)
	public void deletecategory()
	{
		System.out.println("category deleted");
	}
	
	@Test(priority = 5)
	public void deletecourses()
	{
		System.out.println("courses deleted");
	}

	
	@Test(priority = 6)
	public void logout()
	{
		System.out.println("logout done");
	}
}
