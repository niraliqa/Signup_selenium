package day3;

public class TernaryOperator {

	public static void main(String[] args) 
	{	
		
		/*
		 *   Syntax
		 *  store result in variable= Condition ? executeIfTrue: executeIfFalse
		 * 
		 */
		
		
		int num1=100;
		
		int num2=20;
		
		int result=(num1>num2) ? (num1+num2):(num1-num2);
		
		System.out.println(result);
		
		
	}

}
