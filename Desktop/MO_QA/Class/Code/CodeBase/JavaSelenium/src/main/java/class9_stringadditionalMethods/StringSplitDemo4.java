package class9_stringadditionalMethods;

public class StringSplitDemo4 {

	public static void main(String[] args) {

		String str="Price is 300 USD";
		
		String price=str.split(" ")[2];
		
		if(price.equals("200"))
		{
			System.out.println("Price validated");
		}
		else
		{
			System.out.println("Price mismatched");
		}
	}

}
