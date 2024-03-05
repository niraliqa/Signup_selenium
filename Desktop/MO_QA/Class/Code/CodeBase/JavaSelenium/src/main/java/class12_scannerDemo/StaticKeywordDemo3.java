package class12_scannerDemo;

public class StaticKeywordDemo3 {

	static String name;
	
	/*
	 *  You can not access non static field or variable in static methods
	 *  
	 *  you can access static fields and non static fields in non static method
	 * 
	 */
	
	public static void main(String[] args) 
	{
		System.out.println(name);
	
	}
	
}
