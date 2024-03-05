package class15_multipleInterfaces;

public abstract  class SportsCar {

	
	public void start()
	{
		System.out.println("Customer can start the engine automatically");

	}
	
	public void stop()
	{
		System.out.println("Customer can stop the engine automatically");
	
	}
	
	public abstract void drive();
	
}
