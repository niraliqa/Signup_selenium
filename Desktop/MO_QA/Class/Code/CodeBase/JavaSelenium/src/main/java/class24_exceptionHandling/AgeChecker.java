package class24_exceptionHandling;

public class AgeChecker 
{
	
	public static void checkAge(int age) throws NotEligibleException
	{
		
		
		
		if(age<18)
		{
			NotEligibleException e=new NotEligibleException();
			
			throw e;
		}
		else
		{
			System.out.println("Eligible");
		}
		
		
	}
	
	
	
}
