package class21_mapInJava;

import java.util.HashMap;
import java.util.Set;

public class MapInJava3 {

	public static void main(String[] args) {
		
		HashMap<String, String> hm1=new HashMap<String, String>();
		
		hm1.put("JK", "Jenkins");
		
		hm1.put("Se", "Selenium");
		
		hm1.put("MV", "Apache Maven");
		
		hm1.put("Sel", "Selenium");
		
		Set<String> allKeys=hm1.keySet();
		
		System.out.println(allKeys);
		
	}

}
