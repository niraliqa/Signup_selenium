package day6;

public class ArrayDemo6 {

	public static void main(String[] args) 
	{
		
		int arr[]=new int[3];
		
		arr[0]=15;
		
		arr[1]=25;
		
		arr[2]=35;
		
		int arr1[]=arr;
	
		System.out.println(arr1[2]);
		
		arr[1]=88;
		
		System.out.println(arr1[1]);
		
		System.out.println(arr==arr1);
		
		
		
	}

}
