package class10_OOPsDemo1;

public class Students 
{

	// instance variable
	String fullName;
	int age;
	boolean status;
	
	
	
	public static void main(String[] args) 
	{
	
		Students arjun=new Students();
		arjun.fullName="Arjun Rajput";
		arjun.age=22;
		arjun.status=true;
		
		Students ritika=new Students();
		ritika.age=23;
		ritika.fullName="Ritika Kanchan";
		ritika.status=false;
		

		Students manish=new Students();
		manish.fullName="Manish Pandey";
		manish.age=35;
		manish.status=true;
		
		System.out.println(arjun.fullName);
		System.out.println(ritika.age);
		System.out.println(manish.status);
		
		
	}
	
	

}
