package class15_multipleInterfaces;

public class Audi implements Car{

	public static void main(String[] args) 
	{
		
		Car obj1=new Maruti();
		
		obj1.drive();
		
	}
	
	public void drive()
	{
		System.out.println("Customer can driver max 200KM/Hour");
	}
	
	public void stop()
	{
		System.out.println("Customer can stop the engine automatically");
	}
	
	public void start() 
	{
		
		System.out.println("Customer can start the engine automatically");
	}
	
	public boolean isAffordable()
	{
		return false;
	}

}
