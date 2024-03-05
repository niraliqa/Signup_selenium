package day4;

public class SwitchCaseDemo {

	
	/*
	 *  break - jump
	 *  continue - jump
	 * 
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		int month=4;
		
		switch(month)
		{
		case 1: System.out.println("Jan");
		break;
		
		case 2: System.out.println("Feb");
		break;
		
		case 3: System.out.println("March");
		break;
		
		case 4: System.out.println("April");
		break;
		
		/*
		 *  please complete this code and add till dec
		 */
		
		default:
			System.out.println("Have a nice day");
		
		}
		
		System.out.println("End");

	}

}
