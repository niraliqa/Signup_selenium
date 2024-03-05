package class13_inheritance;

public class BaseClass 
{
	
	private String baseName="BaseClassVariable";
	
	/*
	 *  hidden Constructor
	 *  	default Constructor
	 *  		does not have any body- implementation
	 * 
	 */

	public void method1()
	{
		System.out.println("I am in base class - method 1 calling");
	}
	
	public void method2()
	{
		System.out.println("I am in base class - method 2 calling");
	}

	public String getBaseName() 
	{
		return baseName;
	}

	
	

}
