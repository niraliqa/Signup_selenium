package class46_JSDemoOptionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.Utility;

public class FutureDatePicker {

	public static void main(String[] args) {
	
		WebDriver driver=Utility.startBrowser("Chrome","https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		
		boolean status=true;
		
		while(status)
		{
			String month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			String year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(month.equalsIgnoreCase("March") && year.equalsIgnoreCase("2025"))
			{
				status=false;
			}
			else
			{				
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
		
			
			
		}
		
		
	}

}
