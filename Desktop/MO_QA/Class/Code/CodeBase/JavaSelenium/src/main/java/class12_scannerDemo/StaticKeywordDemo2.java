package class12_scannerDemo;

public class StaticKeywordDemo2 {

	
	/*
	 *  static fields can be accessed via classname.fieldName
	 *  static methods can be accessed via classname.methodName
	 * 
	 */
	
	public static void welcomeMsg() 
	{
		System.out.println("Hello Everyone");
	}
	
	
	public static void main(String[] args) 
	{
		welcomeMsg();
		
		StaticKeywordDemo2.welcomeMsg();
	
	}
	
}
