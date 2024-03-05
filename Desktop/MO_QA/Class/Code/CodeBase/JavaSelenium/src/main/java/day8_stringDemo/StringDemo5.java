package day8_stringDemo;

public class StringDemo5 {

	public static void main(String[] args) {
	
		String actualString="Selenium is for web automation";
		
	/*	for(char c: actualString.to)
		{
			
		}
	*/	
		
		
		for(int i=0;i<actualString.length();i++)
		{
			char c=actualString.charAt(i);
			
			System.out.println(c);
		}
		
	}

}
