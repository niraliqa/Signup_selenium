package class22_linkedTreeMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountDuplicateChar {


	public static void main(String[] args) {
		

		String str="SeleniumMavenJenkinsTestng";
		
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		
		char []arr=str.toCharArray();
		
		for(char c:arr)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		//System.out.println(map);
		
		for(Map.Entry<Character, Integer> entries:map.entrySet())
		{
			if(entries.getValue()>1)
			{
				System.out.println(entries.getKey() +":"+entries.getValue());
			}
		}
	
	}

}
