package class49_keyboardEvents;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Utility;
import io.restassured.RestAssured;

public class BrokenLinkChecker5 {

	public static void main(String[] args) {
		
		/*
		 *  Verify Valid images or Found Broken Images
		 * 
		 * 
		 */
		
		WebDriver driver=Utility.startBrowser("Chrome", "https://www.naukri.com/");
		
		List<WebElement> allImages=driver.findElements(By.xpath("//img[@src]"));
		
		System.out.println("Total Images to scan "+allImages.size());
		
		List<String> brokenImages=new ArrayList<String>();

		for(WebElement ele:allImages)
		{
			System.out.println("*****************************************");
			
			String linkHRef=ele.getAttribute("src");
			
			int code=0;
			try 
			{
				code = RestAssured.get(linkHRef).getStatusCode();
				
			} catch (Exception e) 
			{
				System.out.println("Exception While Making Request To "+ linkHRef +" "+e.getMessage());
			}
			
			System.out.println("Status Code For "+linkHRef+" "+code);
			
			if(code<400)
			{
				System.out.println("Link is working as expected");
			}
			else
			{
				brokenImages.add(linkHRef);
				System.out.println("Link is broken");
			}
			System.out.println("*****************************************");
		}
		
		if(brokenImages.size()>0)
		{
			System.out.println("Test Failed- Broken Image Found, Total Broken Images are "+brokenImages.size());
		}
		else
		{
			System.out.println("No Broken Image Found");
		}
		
		driver.quit();
	
	}

}
