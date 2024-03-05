package class10_OOPsDemo1;

public class StudentsNew 
{

	// instance variable
	String fullName;
	int age;
	boolean status;
	
	public void startChapter()
	{
		System.out.println("Chapter Started");
	}
	
	public void completeChapter()
	{
		System.out.println("Chapter Completed");
	}
	

 	public static void main(String[] args) 
	{
	
 		System.out.println("Start");
 		
 		StudentsNew vijay=new StudentsNew();
 		
 		System.out.println(vijay.age);
 		
 		vijay.startChapter();
 		
 		vijay.numberOfChapterCompleted(15);
 		
 		vijay.completeChapter();
 		
 		StudentsNew rizwan=new StudentsNew();
 		
 		rizwan.numberOfChapterCompleted(20);
 		
 		System.out.println("End");
		
	}
	
	
	public void numberOfChapterCompleted(int count)
	{
		//int count=10;
		
		System.out.println("Number of chapter completed is "+count);
	}
	

}
