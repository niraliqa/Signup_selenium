package class32_webElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		WebElement username=driver.findElement(By.id("email1"));
		
		String placeHolderValue=username.getAttribute("placeholder");
		
		System.out.println("Place holder value is "+placeHolderValue);
		
		if(placeHolderValue.equals("Enter Email"))
		{
			System.out.println("Validation 1 - Passed");
		}
		else
		{
			System.out.println("Validation 1 - Failed");
		}
		
		String cssValue=username.getCssValue("border");
		
		System.out.println("Captured CSS "+cssValue);
			
		if(cssValue.contains("2px"))
		{
			System.out.println("Validation 2 - Passed");
		}
		else
		{
			System.out.println("Validation 2 - Failed");
		}
		
		driver.quit();
	}

}
