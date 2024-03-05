package class39_calendar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Utility;

public class HandleDates6 {

	public static void main(String[] args) {
		
		
		WebDriver driver=Utility.startBrowser("Chrome", "https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
			
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Utility.selectValueFromList(driver,By.xpath("//table[contains(@class,'datepicker-calendar')]//td//a"), "25");
				
	}

	
	/*
	 * 
	 * 	public static void selectValueFromList(WebDriver driver,By locator,String value)
	{
		
		List<WebElement> allValues=driver.findElements(locator);
		
		for(WebElement ele:allValues)
		{
			if(ele.getText().equalsIgnoreCase(value))
			{
				ele.click();
				
				break;
			}
		}
		
		
	}

	 * 
	 * 
	 */
}
