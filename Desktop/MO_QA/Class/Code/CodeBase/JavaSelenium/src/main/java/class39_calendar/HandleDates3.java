package class39_calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDates3 {

	public static void main(String[] args) {
				
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
			
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	
		driver.findElement(By.xpath("//a[text()='29']")).click();
		
	}

}
