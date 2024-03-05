package day8_stringDemo;

public class StringDemo4 {

	public static void main(String[] args) {
		
		// this is hard coded value- we will capture this from web apps using Selenium
		String actualString="Please provide valid credentials";
		
		// grab this from testcases
		String expectedString="Please provide valid credentials";
		
		
		// grab this from testcases
		String expectedStringNew="please provide valid credentials";
		
		// do not use == for comparision with String
		//System.out.println(actualString==expectedString);
		
		System.out.println(actualString.equals(expectedString));
		System.out.println(actualString.equals(expectedStringNew));
		System.out.println(actualString.equalsIgnoreCase(expectedStringNew));
		System.out.println(expectedStringNew.contains("mukesh"));
		System.out.println(actualString.startsWith("provide"));
		System.out.println(actualString.endsWith("valid"));

	}

}
