package class41_switchToWindowHandle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Utility;

public class HandleWIndow5 {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver=Utility.startBrowser("https://freelance-learn-automation.vercel.app/login");
		
		String parentWindow=driver.getWindowHandle();
		
		System.out.println("Parent Window Handle "+parentWindow);
		
		List<WebElement> allSocialMediaIcons=driver.findElements(By.xpath("//div[@id='login_container']//div[@class='social-btns']//a"));
		
		for(WebElement ele:allSocialMediaIcons)
		{
			ele.click();
		}
		
		
		Set<String> allWindows=driver.getWindowHandles();
		
		/*
		 *  2- Convert Set to List
		 *  	Option 1 - Set Reference in constructor
		 *  	Option 2-  addAll method
		 *  	Option 3-  get element one by one from set and add to list
		 * 
		 */
		
		//option 3
		List<String> allWindowHandles=new ArrayList<String>();
		
		for(String str:allWindows)
		{
			allWindowHandles.add(str);
		}
		
		driver.switchTo().window(allWindowHandles.get(1));
		
		Thread.sleep(2000);
		
		driver.switchTo().window(allWindowHandles.get(2));
		
		Thread.sleep(2000);
		
		driver.switchTo().window(allWindowHandles.get(3));
		
		Thread.sleep(2000);
		
		driver.switchTo().window(allWindowHandles.get(4));
		
		Thread.sleep(2000);
		
		driver.switchTo().window(allWindowHandles.get(5));
		
		driver.switchTo().window(parentWindow);
		
		
	}

}
