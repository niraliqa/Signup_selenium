package day3;

public class Operators3 {

	public static void main(String[] args) 
	{	
		
		int num1=100;
		
		int num2=99;
		
		boolean status=num1==num2;
		
		int num3=55;
		
		int num4=89;
		
		boolean status1=num3<num4;
		
		/*
		 * &&  
		 * T T = T
		 * T F= F
		 * F T= F
		 * F F = F
		 * 
		 */
		
		System.out.println(status && status1 );
		
		/*
		 * ||  
		 * T T = T
		 * T F = T
		 * F T = T
		 * F F = F
		 * 
		 */
		
		System.out.println(status || status1 );
		
	}

}
