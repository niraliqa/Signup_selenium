package doubtSession;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ListOfOrder 
{

	public static void main(String[] args) 
	{
		Map<String,List<Integer>> m1=new LinkedHashMap<String, List<Integer>>();
		
		List<Integer> values=Arrays.asList(123,79,89,69,888);
		
		Collections.sort(values);
		
		m1.put("Shirts", values);
		
		System.out.println(m1);
		

		if(m1.containsKey("Camera"))
		{
			System.out.println(m1.get("Camera").get(0));
		}
		else
		{
			m1.put("Camera", Arrays.asList(-1));
		}
		
		System.out.println(m1);

	}

}
