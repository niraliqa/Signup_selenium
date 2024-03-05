package class10_OOPsDemo1;

public class Calculator 
{

	public static void main(String[] args) {
			
		Calculator cal=new Calculator();	
		
		int anshul= cal.sum();
		
		System.out.println("Result is "+anshul);

	}
	
	public int sum()
	{
		int a=100;
		
		int b=200;
		
		int c=a+b;
		
		return c;
	}

}
