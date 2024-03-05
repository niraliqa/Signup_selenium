package class32_webElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 *  General Validation
 *  	Title
 *  	URL
 *  	text box text
 *  	page navigation
 *  	page load time
 *  	available
 *  	password - not visible
 *  	image loading - image should not be broken
 *  	link broken -
 *  	password lenght validation
 *  	Selected - Multi Selection
 *  	Tooltip msg
 *  	email validation
 *  	enabled
 *  	color validations based on condition
 *  	popup is present
 *  	alert present
 *  	new tab validation
 *  	Spell checking 
 * 		
 * 
 */

public class WebElementCommands {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		WebElement username=driver.findElement(By.id("email1"));
		
		username.sendKeys("admin@email.com");
		
		username.clear();
		
		username.sendKeys("mukesh@email.com");
	
		boolean displayStatus=username.isDisplayed();
		
		System.out.println("Is Element Displayed ?"+displayStatus);
		
		if(displayStatus)
		{
			System.out.println("Validation 1 - Passed");
		}
		else
		{
			System.out.println("Validation 1 - Failed");
		}
		
		boolean enableStatus=username.isEnabled();
		
		System.out.println("Is Element Enabled ?"+enableStatus);
		
		if(enableStatus)
		{
			System.out.println("Validation 2 - Passed");
		}
		else
		{
			System.out.println("Validation 2 - Failed");
		}
		
		boolean selectedStatus=username.isSelected();
		
		System.out.println("Is Selected  ?"+selectedStatus);
		
		if(!selectedStatus)
		{
			System.out.println("Validation 3 - Passed");
		}
		else
		{
			System.out.println("Validation 3 - failed");
		}
			
	}

}
