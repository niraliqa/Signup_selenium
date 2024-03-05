package class15_multipleInterfaces;

public class WrapperClass {

	public static void main(String[] args) 
	{
		
		/*
		 *  Autoboxing
		 *  			conversion from primitive to non primitive
		 *  	
		 *  
		 *  Unboxing
		 * 				conversion from non primitive to primitive
		 */
	
		int a=10;
		
		// Autoboxing
		Integer b=a;
		
		//boxing
		Integer b1=new Integer(a);
		
		System.out.println(b1);
		
		
		Integer c=30;
		
		int d=c;
		
		System.out.println(d);
		
	}

}
