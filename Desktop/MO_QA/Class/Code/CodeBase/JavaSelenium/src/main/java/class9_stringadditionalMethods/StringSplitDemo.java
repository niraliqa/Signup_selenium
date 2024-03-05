package class9_stringadditionalMethods;

public class StringSplitDemo {

	public static void main(String[] args) {
		
		
		String str="Welcome To Java World";
		
		String arr[]=str.split(" ");
		
		System.out.println(arr[1]);
		
		System.out.println(arr[arr.length-2]);
		
	}

}
