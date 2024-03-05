package class49_keyboardEvents;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Utility;
import io.restassured.RestAssured;

public class BrokenLinkChecker3 {

	public static void main(String[] args) {
		
		// Step 1- Capture all href
		// Step 2- Make API call for each href
		// Step 3- If code<400 working fine else fail
		// Step 4- Once broken link found then add them in new list
		
		WebDriver driver=Utility.startBrowser("Chrome", "https://www.naukri.com/");
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//div[contains(@class,'column')]//a"));
		
		List<String> brokenLink=new ArrayList<String>();

		for(WebElement ele:allLinks)
		{
			String linkHRef=ele.getAttribute("href");
			
			int code=RestAssured.get(linkHRef).getStatusCode();
			
			System.out.println("Status Code For "+linkHRef+" "+code);
			
			if(code==200)
			{
				System.out.println("Link is working as expected");
			}
			else
			{
				brokenLink.add(linkHRef);
				
				System.out.println("Link is broken");
			}
			
		}
		
		if(brokenLink.size()>0)
		{
			System.out.println("Test Failed- Broken Link Found, Total Broken Links are "+brokenLink.size());
		}
		else
		{
			System.out.println("No Broken Link Found");
		}
		
		driver.quit();
		
		
	}

}
