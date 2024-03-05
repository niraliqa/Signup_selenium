package class41_switchToWindowHandle;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Utility;

public class HandleWIndow6 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=Utility.startBrowser("https://freelance-learn-automation.vercel.app/login");
		
		String parentWindow=driver.getWindowHandle();
		
		System.out.println("Parent Window Handle "+parentWindow);
		
		List<WebElement> allSocialMediaIcons=driver.findElements(By.xpath("//div[@id='login_container']//div[@class='social-btns']//a"));
		
		for(WebElement ele:allSocialMediaIcons)
		{
			ele.click();
		}
		
		
		Set<String> allWindows=driver.getWindowHandles();
		
		for(String handles:allWindows)
		{
			System.out.println("Window Handles "+handles);
			
			driver.switchTo().window(handles);
			
			System.out.println("Title of new tabs "+driver.getTitle());
			
			if(driver.getTitle().contains("YouTube"))
			{
				System.out.println("Reached Desired Tab");
				break;
			}
			
		}
		
		System.out.println("URL of child tab "+driver.getTitle());
		/*
		 *  all operation you can perform here
		 * 
		 */
		
		driver.switchTo().window(parentWindow);
		
	}

}
