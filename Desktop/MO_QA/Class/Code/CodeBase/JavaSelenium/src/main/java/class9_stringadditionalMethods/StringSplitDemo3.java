package class9_stringadditionalMethods;

public class StringSplitDemo3 {

	public static void main(String[] args) {

		String str="Welcome Deepak, How are you doing today?";
		
		System.out.println(str.split(",")[0].split(" ")[1]);
		
		
	}

}
