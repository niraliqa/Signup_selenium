package class22_linkedTreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		/*
		 *  Maintain sorting in ascending - based on key
		 * 
		 */
		
		Map<String, Object> student1 = new TreeMap<String, Object>();

		student1.put("Name", "Akshay P");

		student1.put("Phone", 789895);

		student1.put("Payment", true);

		student1.put("Marks", 75.89);
	
		System.out.println(student1);

	}

}
