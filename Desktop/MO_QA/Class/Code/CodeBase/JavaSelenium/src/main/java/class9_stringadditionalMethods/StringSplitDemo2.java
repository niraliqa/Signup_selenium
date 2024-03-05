package class9_stringadditionalMethods;

public class StringSplitDemo2 {

	public static void main(String[] args) {
		
		String str="Welcome Bala, How are you doing today?";
		
		String arr[]=str.split(",");
	
		System.out.println(arr[1]);
		
		String newarr[]=arr[0].split(" ");
		
		System.out.println(newarr[1]);
	}

}
