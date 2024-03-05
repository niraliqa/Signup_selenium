package class39_calendar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutoSuggestions4 {

	public static void main(String[] args) throws InterruptedException {
		
	/*
	 *  //div[@role='presentation']//span//b
	 *  
	 *  //span[contains(text(),'mukesh otwani')]
	 *  
	 *  //ul[@class='G43f7e']//div//span
	 *  
	 *  //div[@role='presentation']//span//b
	 * 
	 * 	//div[@role='option']//div[@role='presentation']//span
	 * 
	 */
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	driver.findElement(By.name("q")).sendKeys("Mukesh Otwani");
	
	Thread.sleep(2000);
	
	List<WebElement> allSuggestions=driver.findElements(By.xpath("//div[@role='option']//div[@role='presentation']//span"));
		
	System.out.println("Total Suggestions "+allSuggestions.size());
	
	for(WebElement ele:allSuggestions)
	{
		String value=ele.getText();
		
		if(value.length()>0)
		{
			System.out.println("Values are "+value);
			
			if(value.contains("blog"))
			{
				ele.click();
				break;
			}
		}
	
	}
	
		
	}

}
