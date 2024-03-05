package class23_exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling 
{
	/*
	 * InputMismatchException
	 * ArithmeticException
	 * IllegalStateException
	 */

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Please enter number 1");
			
			int num1=sc.nextInt();
			
			System.out.println("Please enter number 2");
			
			int num2=sc.nextInt();
			
			int result=num1/num2;
			
			System.out.println("Result is "+result);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Please dont enter 0 for division "+e.getMessage());
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please dont enter any other data type for calcu- please use int");
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong "+e.getMessage());
		}
		
		finally 
		{
			sc.close();
			
			System.out.println("Bye Bye");
		}
	
		
	}

}
