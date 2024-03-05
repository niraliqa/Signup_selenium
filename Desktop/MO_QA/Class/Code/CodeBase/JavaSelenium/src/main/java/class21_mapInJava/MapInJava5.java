package class21_mapInJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapInJava5 {

	public static void main(String[] args) {

		Map<String, Object> student1 = new HashMap<String, Object>();

		student1.put("Name", "Akshay P");

		student1.put("Phone", 789895);

		student1.put("Payment", true);

		student1.put("Marks", 75.89);

		Map<String, Object> student2 = new HashMap<String, Object>();

		student2.put("Name", "Anshul");

		student2.put("Phone", 889966);

		student2.put("Payment", false);

		student2.put("Marks", 76.89);

		Map<String, Object> student3 = new HashMap<String, Object>();

		student3.put("Name", "Muttu");

		student3.put("Phone", 774411);

		student3.put("Payment", true);

		student3.put("Marks", 70.89);
		
		List<Map<String,Object>> allStudents=new ArrayList<Map<String,Object>>();
		
		allStudents.add(student1);
		
		allStudents.add(student2);
		
		allStudents.add(student3);
		
		System.out.println(allStudents);
		
		System.out.println(allStudents.get(0).get("Phone"));
		System.out.println(allStudents.get(1).get("Marks"));
		System.out.println(allStudents.get(2).get("Name"));
		
		System.out.println(allStudents.get(0));
		

	}

}
