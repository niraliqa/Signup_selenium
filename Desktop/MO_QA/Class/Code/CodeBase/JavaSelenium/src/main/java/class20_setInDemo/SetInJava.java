package class20_setInDemo;

import java.util.HashSet;

public class SetInJava {

	/*
	 * 
	 *  List maintains elements using index - maintains order
	 *  Set does not maintain any index  - no order guranted
	 *  
	 *  List allow duplicates
	 *  Set does not allow duplicates
	 *  
	 *  HashSet allow null values - yes
	 *  LinkedHashset allow null values - yes
	 *  TreeSet allow null - no
	 * 
	 */
	
	
	public static void main(String[] args) 
	{
		
		HashSet<String> hs1=new HashSet<String>();
		
		System.out.println(hs1.add("Selenium"));
		
		System.out.println(hs1.add("Selenium"));
		
		System.out.println(hs1.add("Java"));
		
		System.out.println(hs1.add("Maven"));
		
		System.out.println(hs1);
		
		hs1.remove("java");
		
		System.out.println(hs1);
		
		System.out.println(hs1.size());
		

	}

}
