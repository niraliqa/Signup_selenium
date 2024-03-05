package class18_ListInDetails;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo2 {

	public static void main(String[] args) {
		
		List<String> list1= Arrays.asList("Selenium","Maven","TestNG");
		
		/*
		 *  difference between iterator, listiterator, splititerator
		 * 
		 */
		
		Iterator<String> itr=list1.iterator();
		
		while(itr.hasNext())
		{
			String value=itr.next();
			
			System.out.println(value);
		}
		
		
	}

	
	
	
}
