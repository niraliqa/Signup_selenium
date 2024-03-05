package class21_mapInJava;

import java.util.HashMap;

public class MapInJava2 {

	public static void main(String[] args) {
		
		HashMap<String, String> hm1=new HashMap<String, String>();
		
		hm1.put("JK", "Jenkins");
		
		hm1.put("Se", "Selenium");
		
		hm1.put("MV", "Maven");
		
		hm1.put("MV", "Apache Maven");
		
		hm1.put("Sel", "Selenium");
		
		System.out.println(hm1.get("S"));
		
		hm1.remove("JK");
		
		System.out.println(hm1);
		
		hm1.replace("Se", "Selenium WebDriver");
		
		System.out.println(hm1);

	}

}
