package day5;

public class LoopsWithCondition {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
			
			if(i==65)
			{
				System.out.println("Found");
				break;		
			}
			
		}
		
		System.out.println("End");

	}

}
