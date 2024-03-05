package class15_multipleInterfaces;

public class Maruti implements Car{

	public static void main(String[] args) 
	{
		
		Vehicle obj1=new Maruti();
			
		obj1.start();
			
		obj1.stop();
		
		
	}
	
	public void drive()
	{
		System.out.println("Customer can driver max 100KM/Hour");
	}
	
	public void stop()
	{
		System.out.println("Customer can stop the engine manually");
	}
	
	public void start() 
	{
		
		System.out.println("Customer can start the engine manually");
	}
	
	public boolean isAffordable()
	{
		return true;
	}

}
