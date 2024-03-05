package class16_collectionDemo;

import java.util.ArrayList;

public class ListDemo2 {

	public static void main(String[] args) {
		
		
		/*
		 *  Add method used when you want to add any element in the list
		 *  get method used to fetch the element from the list
		 * 
		 * 
		 */
		
		
		System.out.println("Start");
		
		ArrayList list1=new ArrayList();
		
		list1.add(20);
		
		list1.add(12.5);
		
		list1.add(true);
		
		list1.add("Mukesh Otwani");
		
		list1.add('c');
		
		list1.add("anusha");
		
		list1.add("lokesh");
		
		list1.add(0, "Praful");
		
		System.out.println("Size of list is "+list1.size());
		
		System.out.println(list1.get(list1.size()-2));
		
		System.out.println("End");
		
	}

}
