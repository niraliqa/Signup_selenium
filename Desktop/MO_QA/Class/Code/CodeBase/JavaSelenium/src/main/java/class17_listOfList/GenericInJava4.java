package class17_listOfList;

import java.util.ArrayList;

public class GenericInJava4 {

	public static void main(String[] args) {
	
		Emp emp1=new Emp("Arpita",7898,false);
		
		Emp emp2=new Emp("Mudita",889966,true);
		
		Emp emp3=new Emp("Anshul",889966,true);
		
		ArrayList<Emp> list1=new ArrayList<Emp>();
		
		list1.add(emp1);
		
		list1.add(emp2);
		
		list1.add(emp3);
		
		System.out.println(list1.get(2).toString());
		

	}

}
