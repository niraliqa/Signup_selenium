package doubtSession;

public class Student {

	int phone;
	
	public Student(int phone)
	{
		this();
		this.phone=phone;
	}
	
	public Student()
	{
		System.out.println("Hello Student");
	}
	
	public static void main(String[] args) {
		
		Student s1=new Student(165);
		
		Student s2=new Student(265);
		
		Student s3=new Student(365);
		
	}
	
	public void show()
	{
		System.out.println("Show number "+ this.phone);
	}
	
	
	

}
