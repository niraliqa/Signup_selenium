package class13_inheritance;

public class SubClass extends BaseClass {

	
	String childName="ChildName";

	public static void main(String[] args) 
	{
		//a - reference which is holding object of SubClass
		// a- is object
		
		//1 - Reference is from child class and Object is also from child class
	    // this allows us to access base class + child class
		SubClass a=new SubClass();
		
	
		
		//2- Reference is from base class and Object is also from base class
		// this allows us to access base class only
		BaseClass b=new BaseClass();
		
		
		//3- Reference is from base class but it is holding object of child class
		// can access only base class methods - references plays very imp role
		BaseClass c=new SubClass();
		c.method1();
		c.method2();
		
		

		//4 - Reference is from child class but it is holding object of base class - not allowed In Java
		//SubClass d=new BaseClass();

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
