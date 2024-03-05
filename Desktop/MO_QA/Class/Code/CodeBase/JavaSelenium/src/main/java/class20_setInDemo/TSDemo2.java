package class20_setInDemo;

import java.util.Set;
import java.util.TreeSet;

public class TSDemo2 {

	public static void main(String[] args) {
		
		Set<String> ts1=new TreeSet<String>();
	
		ts1.add("Selenium");
		
		ts1.add("Selenium");
		
		ts1.add("Selenium");
		
		ts1.add("Selenium");
		
		ts1.add("Cypress");
		
		ts1.add("appium");
		
		ts1.add("Appium");
		
		ts1.add("Zypher");
		
		System.out.println(ts1.size());
		
		System.out.println(ts1);
		

	}

}
