package class18_ListInDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfList {

	public static void main(String[] args) {
		
	List<String> morningBatch=Arrays.asList("vijay","umar","suraj");
	
	List<String> eveningBatch=Arrays.asList("sreevidya","soumya","sanu");
	
	List<String> nightBatch=Arrays.asList("ramesh","raj","anand");
	
	List<Object> l1= Arrays.asList("Lokesh",10,15.5,false,'c');
	
	List<List<String>> allBatches=new ArrayList<List<String>>();
		
	allBatches.add(morningBatch);
	
	allBatches.add(eveningBatch);
	
	allBatches.add(nightBatch);
	
	System.out.println(allBatches.get(1).get(2));
	
	System.out.println(allBatches.get(0).get(0));
	
	System.out.println(allBatches.get(2).get(1));
		

	}

}
