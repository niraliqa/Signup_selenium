package class21_mapInJava;

import java.util.HashMap;

public class MapInJava {

	public static void main(String[] args) {
		
		HashMap<String, String> hm1=new HashMap<String, String>();
		
		hm1.put("JK", "Jenkins");
		
		hm1.put("Se", "Selenium");
		
		hm1.put("MV", "Maven");
		
		hm1.put("MV", "Apache Maven");
		
		hm1.put("Sel", "Selenium");
		
		hm1.put("G", null);
		
		hm1.put(null, "Github");
		
		hm1.put(null,null);
		
		System.out.println(hm1);
		
		
		

	}

}
