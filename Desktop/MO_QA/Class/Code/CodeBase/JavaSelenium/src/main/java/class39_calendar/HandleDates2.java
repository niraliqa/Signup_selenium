package class39_calendar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDates2 {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		
		driver.findElement(By.id("datepicker")).click();
			
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		List<WebElement> allDates=driver.findElements(By.xpath("//table[contains(@class,'datepicker-calendar')]//td//a"));
		
		for(WebElement ele:allDates)
		{
			String dates=ele.getText();
			
			System.out.println("Dates are "+dates);
			
			if(dates.equalsIgnoreCase("22"))
			{
				ele.click();
				break;
			}
			
		}
		
		
	}

}
