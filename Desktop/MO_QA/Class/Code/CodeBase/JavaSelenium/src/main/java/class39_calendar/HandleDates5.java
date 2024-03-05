package class39_calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.Utility;

public class HandleDates5 {

	public static void main(String[] args) 
	{
		WebDriver driver=Utility.startBrowser("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	
		driver.findElement(By.id("datepicker")).sendKeys("01/22/2024");
	}

}
