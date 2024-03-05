package class17_listOfList;

import java.util.ArrayList;
import java.util.List;

public class ListOfList2 {

	public static void main(String[] args) {
		
		List<String> names=new ArrayList<String>();
		
		names.add("Selenium");
		names.add("Cypress");
		names.add("Playwright");
		
		List<String> apiTools=new ArrayList<String>();
		apiTools.add("Postman");
		apiTools.add("RestAssured");
		apiTools.add("HTTPClient");
		
		// way 2 - pick values one by one from list and add to another list
		for(String value:apiTools)
		{
			names.add(value);
		}
		
		System.out.println(names);

	}

}
