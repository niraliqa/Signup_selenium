package class11_polymorphism;

public class Calc {

	public String fullName()
	{
		String name="Rahul Bajaj";
		
		start();
		
		return name;

	}
	
	
	
	public void start()
	{
		System.out.println("Welcome To Calc");
	}
	
	public double add()
	{
		double sum=30;
		
		
		
		return sum;
	}
	
	public boolean present()
	{
		
		
		return true;
	}
	
	
	public static void main(String[] args) 
	{
		
		Calc c1=new Calc();
		
		double sum=c1.add();
		
		System.out.println(sum);
		
		boolean status=c1.present();
		
		if(status)
		{
			System.out.println("Present in the calc");
		}
		else
		{
			System.out.println("Not present in the calc");
		}
		
		String name=c1.fullName();
		
		if(name.contains("Otwani"))
		{
			System.out.println("Trainer is present");
		}
		else
		{
			System.out.println("Trainer not present");
		}
		
	}
	
	
	
	

}
