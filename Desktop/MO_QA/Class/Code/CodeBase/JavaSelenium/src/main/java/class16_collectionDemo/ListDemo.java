package class16_collectionDemo;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		
		ArrayList list1=new ArrayList();
		
		boolean status=list1.add(10);
		
		int size=list1.size();
		
		System.out.println("Added "+status);
		
		list1.add(20);
		
		list1.add(50);
		
		list1.add(50);
		
		list1.add(30);
		
		list1.add(null);
		
		list1.add(null);
		
		list1.add(12.5);
		
		list1.add(true);
		
		list1.add("Mukesh Otwani");
		
		list1.add('c');
		
		list1.add(9, "Selenium");
		
		System.out.println(list1);
		
	}

}
