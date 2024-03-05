package class49_keyboardEvents;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BrokenLinkChecker2 {

	public static void main(String[] args) {
		
		/*
		 *  Make a request to https://www.naukri.com/ 
		 *  Wait for response
		 *  If response is 2XX and 3XX then pass link is working
		 *  else fail
		 * 
		 * 	Option 1 - Apache HTTP Client
		 *  Option 2 - RestAssured 
		 * 
		 */
			
		int code=RestAssured.get("https://www.naukri.com").statusCode();
		
		System.out.println(code);

	}

}
