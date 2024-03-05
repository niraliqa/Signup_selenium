package class39_calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDates4 {

	// Select future date - 14th Feb 2025
	
	public static void main(String[] args) {
				
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
			
		// capture month //span[contains(@class,'datepicker-month')]
		
		// capture year //span[contains(@class,'datepicker-year')]
		
		/*
		 *  if condition
		 *  	month = feb && year 2025
		 *  then 
		 *  	click on 14th
		 * 
		 */
		
	}

}
