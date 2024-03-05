package class11_polymorphism;

public class Calculator {


	public static void main(String[] args) 
	{
		
		Calculator c1=new Calculator();
		
		c1.add();
		
		c1.add(15.5, 65.5);
		
		c1.add(15.5, 0);
		
		c1.add(15, 65.89);
		
		c1.add(78,78);
		
		System.out.println();
	
	}
	
	/*
	 *  Method Overloading
	 *  
	 *  When you use the same method but with different signature
	 *  	1- number of argument
	 *      2- type of argument
	 *      3- order of arguments
	 * 
	 */
	
	public void add()
	{
		System.out.println("1- Adding some numbers");
		
		
	}
	
	public void add(int num1,int num2)
	{
		int result=num1+num2;
		
		System.out.println("2- Sum of two number - Result is "+result);
	}
	
	public void add(double num1,int num2)
	{
		double result=num1+num2;
		
		System.out.println("3- Sum of two number - Result is "+result);
	}
	
	public void add(int num1,double num2)
	{
		double result=num1+num2;
		
		System.out.println("4- Sum of two number - Result is "+result);
	}
	
	public void add(double num1,double num2)
	{
		double result=num1+num2;
		
		System.out.println("5- Sum of two double number - Result is "+result);
	}
	
	public void add(int num1,int num2,int num3)
	{
		int result=num1+num2+num3;
		
		System.out.println("6- Sum of three number- Result is "+result);
	}
	
}
