package class22_linkedTreeMap;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sample {

	public static void main(String[] args) {
		
		
		String str="Shwetaa";
		
		char []arr=str.toCharArray();
		
		Set<Character> hs1=new LinkedHashSet<Character>();
		
		for(char c:arr)
		{
			hs1.add(c);
		}
		
		System.out.println(hs1);

	}

}
