package class21_mapInJava;

import java.util.Collection;
import java.util.HashMap;

public class MapInJava4 {

	public static void main(String[] args) {
		
		HashMap<String, String> hm1=new HashMap<String, String>();
		
		hm1.put("JK", "Jenkins");
		
		hm1.put("Se", "Selenium");
		
		hm1.put("MV", "Apache Maven");
		
		hm1.put("Sel", "Selenium");
		
		Collection<String> allValues=hm1.values();
		
		System.out.println(allValues);
		
		System.out.println(hm1.containsKey("Mv"));
		
		System.out.println(hm1.containsValue("Selenium"));
	}

}
