package class17_listOfList;

import java.util.ArrayList;
import java.util.List;

public class ListOfList {

	public static void main(String[] args) {
		
		List<String> names=new ArrayList<String>();
		
		names.add("Selenium");
		names.add("Cypress");
		names.add("Playwright");
		
		List<String> apiTools=new ArrayList<String>();
		apiTools.add("Postman");
		apiTools.add("RestAssured");
		apiTools.add("HTTPClient");
		
		// Way 1 - Add all values from another list
		names.addAll(apiTools);
		
		System.out.println(names);
		

	}

}
