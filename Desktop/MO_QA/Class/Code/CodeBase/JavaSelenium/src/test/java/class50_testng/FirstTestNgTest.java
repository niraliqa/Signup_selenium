package class50_testng;

import org.testng.annotations.Test;

public class FirstTestNgTest 
{
	@Test(description = "This test will execute sample 1 scenario")
	public void test1()
	{
		System.out.println("Test 1 Executed");
	}
	
	@Test(description = "This test will execute sample 2 scenario")
	public void test2()
	{
		System.out.println("Test 2 Executed");
	}
	
	
	@Test(description = "This test will execute sample 3 scenario",invocationCount = 10)
	public void test3()
	{
		System.out.println("Test 3 Executed");
	}

}
