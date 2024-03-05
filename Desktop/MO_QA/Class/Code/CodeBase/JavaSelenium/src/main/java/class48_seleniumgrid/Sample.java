package class48_seleniumgrid;

public class Sample {

	public static void main(String[] args) {
		
		//sum(11,21);
		
		startBrowser(false);
		
	}
	
	public static void sum(int num1,int num2)
	{
		System.out.println(num1+num2);
	}
	
	public static void startBrowser(boolean status)
	{
		if(status)
		{
			System.out.println("Starting browser");
		}
		else
		{
			System.out.println("Bye Bye");
		}
		
	}
	

}
