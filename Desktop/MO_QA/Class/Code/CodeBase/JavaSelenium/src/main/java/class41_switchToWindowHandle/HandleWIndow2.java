package class41_switchToWindowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.Utility;

public class HandleWIndow2 {

	public static void main(String[] args) {
		
		WebDriver driver=Utility.startBrowser("https://freelance-learn-automation.vercel.app/login");
		
		String parentWindow=driver.getWindowHandle();
		
		System.out.println("Parent Window Handle "+parentWindow);
		
		//driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();

		driver.findElements(By.xpath("//a[contains(@href,'facebook')]")).get(0).click();
		
		Set<String> allWindows=driver.getWindowHandles();
		
		/*
		 *  1 - Approach - Compare parent window handle with child window handle using Iterator
		 * 
		 */
		
		Iterator<String> itr=allWindows.iterator();
		
		while(itr.hasNext())
		{
			
			String handle=itr.next();
			
			if(!parentWindow.equalsIgnoreCase(handle))
			{
				driver.switchTo().window(handle);
				
				if(driver.getTitle().contains("Facebook"))
				{
					System.out.println("Switched To Child Tab");
					
					/*
					 *  perform all actions here
					 * 
					 */
					
				}
			}
			
			
		}
			
		driver.switchTo().window(parentWindow);
		
		if(driver.getTitle().contains("Courses"))
		{
			System.out.println("Switched To Parent Tab");
		}
		else
		{
			System.out.println("Could not Switched To Parent Tab");
		}
		
	}

}
