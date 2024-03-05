package class20_setInDemo;

import java.util.LinkedHashSet;

public class LHSDemo {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lsh1=new LinkedHashSet<String>();
		
		lsh1.add("Selenium");
		
		lsh1.add("Selenium");
		
		lsh1.add("Selenium");
		
		lsh1.add("Selenium");
		
		lsh1.add("Cypress");
		
		lsh1.add("Appium");
		
		lsh1.add("Zypher");
		
		System.out.println(lsh1.size());
		System.out.println(lsh1);
		

	}

}
