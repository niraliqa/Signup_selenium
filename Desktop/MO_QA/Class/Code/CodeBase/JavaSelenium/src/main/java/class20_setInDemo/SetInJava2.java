package class20_setInDemo;

import java.util.HashSet;

public class SetInJava2 {
	
	public static void main(String[] args) 
	{
		
		HashSet<String> hs1=new HashSet<String>();
		
		hs1.add("Selenium");
		
		hs1.add("Selenium");
		
		hs1.add("Java");
		
		hs1.add("Maven");
		
		
		for(String str:hs1)
		{
			System.out.println("Values In Set "+str);
		}
		
		
		
		

	}

}
