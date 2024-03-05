package doubtSession;

public class Child extends Base{

	public Child()
	{
		//super();
		System.out.println("Child Class 0 argu cons");
	}
	
	public Child(String name)
	{
		//super(name);
		System.out.println("Child Class 1 argu cons with value"+name);

	}
	
	
	public static void main(String[] args) 
	{
		Child obj1=new Child("Lalit");
	
	}

}
