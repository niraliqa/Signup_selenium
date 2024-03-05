package class17_listOfList;

import java.util.ArrayList;
import java.util.List;

public class ListOfList4 {

	public static void main(String[] args) {
		
		List<String> names=new ArrayList<String>();
		names.add("Selenium");
		names.add("Cypress");
		names.add("Playwright");
		
		List<String> apiTools=new ArrayList<String>();
		apiTools.add("Postman");
		apiTools.add("RestAssured");
		apiTools.add("HTTPClient");
		apiTools.add("Katalon");
		apiTools.add("JMeter");
		apiTools.add("SOAPUI");
		apiTools.add("Karate");
		apiTools.add("Katalium");
		
		// WAP to add only values which starts with K and add them in names List
		
		for(int i=0;i<apiTools.size();i++)
		{
			String value=apiTools.get(i);
			
			if(value.startsWith("K"))
			{
				names.add(value);
			}
		}
	
		
		System.out.println(names);

	}

}
