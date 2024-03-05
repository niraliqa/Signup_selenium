package class18_ListInDetails;

import java.util.Arrays;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		
		List<String> list1= Arrays.asList("Selenium","Maven","Testng");
		
		List<Integer> list2=Arrays.asList(15,25,35);
		
		List<Double> list3=Arrays.asList(15.5,25.5,35.5);
		
		
		
		System.out.println(list1);
		
		list1.remove(1);
		
		System.out.println(list1);
	}

	public static void sum(int ...var)
	{
		for(int value:var)
		{
			System.out.println(value);
		}
	}
	
	
}
