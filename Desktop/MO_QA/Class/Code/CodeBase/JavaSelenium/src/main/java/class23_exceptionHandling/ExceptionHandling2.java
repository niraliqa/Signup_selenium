package class23_exceptionHandling;

public class ExceptionHandling2 
{
	

	public static void main(String[] args) 
	{
		
		System.out.println("Start");
		
		try 
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread Interrupted "+e.getMessage());
		}
		
		System.out.println("End");
	
		
		
		
	}

}
