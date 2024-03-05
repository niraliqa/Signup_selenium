package class20_setInDemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates2 {

	public static void main(String[] args) {
		
		
		/*
		 *  While creating Object we can also pass another reference of Collection
		 *  
		 *  To remove duplicates we can pass List reference while creating Set
		 * 
		 */
		
		List<String> values=Arrays.asList("Java","Java","Java","JavaScript","Python");
		
		System.out.println(values);
		
		Set<String> newValues=new HashSet<String>(values);
	
		System.out.println(newValues);
		
		
	}

}
