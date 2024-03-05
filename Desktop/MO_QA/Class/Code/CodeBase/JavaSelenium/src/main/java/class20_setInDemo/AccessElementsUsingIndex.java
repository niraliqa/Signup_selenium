package class20_setInDemo;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class AccessElementsUsingIndex {

	public static void main(String[] args) {
		
		Set<String> hs1=new LinkedHashSet<String>();
		
		hs1.add("Postman");
		
		hs1.add("RestAssured");
		
		hs1.add("HTTPClient");
		
		// pass hs1 (set) while creating list
		
		List<String> l1=new ArrayList<String>(hs1);
		
		System.out.println(l1.get(1));

	}

}
