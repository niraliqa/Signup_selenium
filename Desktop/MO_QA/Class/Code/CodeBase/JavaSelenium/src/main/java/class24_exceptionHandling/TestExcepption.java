package class24_exceptionHandling;

import java.util.Scanner;

public class TestExcepption {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter your age");
		
		int age=sc.nextInt();
		
		try 
		{
			AgeChecker.checkAge(age);
			
		} catch (NotEligibleException e) 
		{
			System.out.println("Exception "+e.getMessage());
		}
		
		sc.close();
		

	}

}
