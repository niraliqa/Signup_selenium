package day3;

public class ConditionStatement2 {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		int age=19;
		
		char gender='F';
		
		if(age>18)
		{
			System.out.println("Eligible based on age");
			
			if(gender=='M')
			{
				System.out.println("Eligible for covidshield");
			}
			else
			{
				System.out.println("Eligible for Covaxine");
			}
			
		}
		else
		{
			System.out.println("Please visit another counter");
		}
		
		
		
		System.out.println("End");

	}

}
