package class13_inheritance;

public class ChildClass extends BaseClass {

	
	String childName="ChildName";
	
	/*
	 *  hidden Constructor
	 *  	default Constructor
	 *  		does not have any body- implementation
	 * 
	 */
	
	
	public static void main(String[] args) 
	{
		
		ChildClass c=new ChildClass();
		
		System.out.println(c.childName);
		
		// can access from base class, parent class
		System.out.println(c.getBaseName());
		
		// method 1 and method 2 is from base class
		c.method1();
		c.method2();
		c.method3();
		c.method4();
		

	}
	
	public void method3()
	{
		System.out.println("I am in child class - method 3 calling");
	}
	
	public void method4()
	{
		System.out.println("I am in child class - method 4 calling");
	}
	

}
