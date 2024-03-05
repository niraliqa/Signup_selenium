package class22_linkedTreeMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LInkedHashMapDemo {

	public static void main(String[] args) {
		
		/*
		 *  Maintain insertion order of entries 
		 * 
		 */
		
		Map<String, Object> student1 = new LinkedHashMap<String, Object>();

		student1.put("Name", "Akshay P");

		student1.put("Phone", 789895);

		student1.put("Payment", true);

		student1.put("Marks", 75.89);
		
		System.out.println(student1);

	}

}
