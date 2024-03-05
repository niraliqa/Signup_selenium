package class20_setInDemo;

import java.util.HashSet;
import java.util.Iterator;

public class SetInJava3 {
	
	public static void main(String[] args) 
	{
		
		HashSet<String> hs1=new HashSet<String>();
		
		hs1.add("Selenium");
		
		hs1.add("Selenium");
		
		hs1.add("Java");
		
		hs1.add("Maven");
		
		Iterator<String> itr=hs1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		

	}

}
