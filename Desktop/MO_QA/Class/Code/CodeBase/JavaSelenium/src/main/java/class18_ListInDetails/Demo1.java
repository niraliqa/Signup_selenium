package class18_ListInDetails;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo1 {
	
	public static void main(String[] args) {
		
	List<Integer>l0=Arrays.asList(2,3,11);	
		
	List<Integer>l1=Arrays.asList(11,2,3);
		
	Collections.sort(l1);
	
	System.out.println(l1);
	
	System.out.println(l0);
	
	System.out.println(l1);
	
	System.out.println(l0.equals(l1));
	
	
	
	}

}
