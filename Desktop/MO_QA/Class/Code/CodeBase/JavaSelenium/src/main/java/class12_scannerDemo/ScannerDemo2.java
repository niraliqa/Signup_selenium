package class12_scannerDemo;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Please enter first name ");
		
		String fName=sc.next();
		
		System.out.println("Please enter last name ");
		
		String lName=sc.next();
		
		System.out.println("Thank you "+fName+" "+lName+" for your interest we will get back to you");
			
		sc.close();
		
	}

}
