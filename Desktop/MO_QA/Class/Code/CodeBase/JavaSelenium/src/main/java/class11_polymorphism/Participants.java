package class11_polymorphism;

public class Participants {

	String name;
	String email;
	boolean paymentStatus;
	int phone;
	
	/*
	 *  Rules for creating constructor - constructor construct the values for object
	 * 
	 *  1- Constructor will have the same name as class name
	 *  2- does not return any value - any return type not even void
	 *  3- will be called automatically when you create object
	 */
	
	public Participants(String fullName,String emaildID,boolean status,int phoneNumber)
	{
		System.out.println("Calling cons......");
		
		name=fullName;
		
		email=emaildID;
		
		paymentStatus=status;
		
		phone=phoneNumber;
	}
	
	public Participants()
	{
		System.out.println("Calling default cons......");
	}
	
	public static void main(String[] args) 
	{
		/*
		Participants anshul=new Participants("Anshual Kumar", "anshual@gmail.com", true, 44);
		Participants deepthi=new Participants("Deepti Joshi", "joshi@gmail.com", false, 55);
		Participants keerthi=new Participants("keerthi", "keerthi@gmail.com", false, 98);
		
		*/
		
		Participants anshul=new Participants("Anshual Kumar", "anshual@gmail.com", true, 44);
		Participants deepthi=new Participants();
		Participants keerthi=new Participants();
		
		System.out.println(keerthi.phone);
		System.out.println(deepthi.phone);
		System.out.println(anshul.phone);

		

	}

}
