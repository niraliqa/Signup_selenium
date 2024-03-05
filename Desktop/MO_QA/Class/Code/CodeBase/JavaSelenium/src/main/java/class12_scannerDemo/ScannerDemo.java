package class12_scannerDemo;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Please enter first number");
		
		int number1=sc.nextInt();
		
		System.out.println("Please enter second number");
		
		int number2=sc.nextInt();
		
		int result=number1+number2;
		
		System.out.println("Result is "+result);
		
		sc.close();
		
		
	}

}
