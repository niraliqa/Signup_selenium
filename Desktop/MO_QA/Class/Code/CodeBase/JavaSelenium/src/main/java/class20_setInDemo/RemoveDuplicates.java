package class20_setInDemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		
		/*
		 *  use addAll method - add List Items to Set
		 * 
		 */
		
		List<String> values=Arrays.asList("Java","Java","Java","JavaScript","Python");
		
		System.out.println(values);
		
		Set<String> newValues=new HashSet<String>();
		
		newValues.addAll(values);
		
		System.out.println(newValues);
		
		
	}

}
