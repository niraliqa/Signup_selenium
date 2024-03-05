package class12_scannerDemo;

public class StaticKeywordDemo {

	static String trainerName="Mukesh";
	
	String name;
	
	String email;
	
	int number;
	
	public StaticKeywordDemo(String fname,String emailId,int phone)
	{
		name=fname;
		email=emailId;
		number=phone;
	}
	
	public static void main(String[] args) {
		
		
		StaticKeywordDemo student1=new StaticKeywordDemo("Isahaq","Isahaq@gmail.com",7878);
		
		StaticKeywordDemo student2=new StaticKeywordDemo("Praful","Praful@gmail.com",779966);
		
		StaticKeywordDemo student3=new StaticKeywordDemo("Anand","Anand@gmail.com",336699);
		
		student1.showStudentDetails();
		
		student2.showStudentDetails();
		
		student3.showStudentDetails();
	}
	
	public void showStudentDetails()
	{
		System.out.println("Hi "+name+" Thank you for enrollment, see you the in class Your trainer will be "+trainerName);
	}
	

}
