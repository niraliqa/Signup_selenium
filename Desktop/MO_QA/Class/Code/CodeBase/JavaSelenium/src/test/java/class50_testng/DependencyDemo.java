package class50_testng;

import org.testng.annotations.Test;

public class DependencyDemo 
{
	@Test
	public void loginTest()
	{
		System.out.println(10/0);
		System.out.println("Login Done");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void logoutTest()
	{
		System.out.println("Logout Done");
	}

}
