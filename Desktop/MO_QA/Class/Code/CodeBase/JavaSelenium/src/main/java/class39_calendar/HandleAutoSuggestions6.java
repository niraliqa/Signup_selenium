package class39_calendar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Utility;

public class HandleAutoSuggestions6 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=Utility.startBrowser("Chrome", "https://seleniumpractise.blogspot.com/2016/08/how-to-handle-autocomplete-feature-in.html");
		
		driver.findElement(By.xpath("//input[contains(@class,'autocomplete')]")).sendKeys("A");
		
		Thread.sleep(2000);
		
		List<WebElement> allSuggestions=driver.findElements(By.xpath("//ul[contains(@class,'autocomplete')]//div"));
		
		for(WebElement ele:allSuggestions)
		{
			String values=ele.getText();
			
			System.out.println(values);
			
			if(values.equalsIgnoreCase("Java"))
			{
				ele.click();
				break;
			}
			
		}
		
	}

}
