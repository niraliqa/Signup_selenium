package day6;

public class ArrayDemo5 {

	public static void main(String[] args) 
	{
		
		//WAP to get the sum of all numbers in given array
	
		int arr[]=new int[5];
		
		arr[0]=15;
		
		arr[1]=25;
		
		arr[2]=35;
		
		arr[3]=45;
		
		arr[4]=55;
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.println(sum);
		
		
	}

}
