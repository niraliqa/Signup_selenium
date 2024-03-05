package day7_array2d;

public class ArrayDemo4 {

	public static void main(String[] args) {
		
		// 23.4, -34.5, 50.1, 33.5, 55.5, 43.7, 5.7, -66.5
		
		double numArray[]= {23.4, -34.5, 50.1, 333.5, 55.5, 43.7, 5.7, -66.5,88.5};
		
		double largestValue=numArray[0];
		
		for(double num:numArray)
		{
			
			if(largestValue<num)
			{
				largestValue=num;
			}
			
		}
		
		System.out.println("Largest Number is "+largestValue);
		

	}

}
