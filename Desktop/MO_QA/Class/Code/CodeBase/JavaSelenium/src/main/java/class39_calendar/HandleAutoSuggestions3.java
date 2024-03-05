package class39_calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutoSuggestions3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-autocomplete-feature-in.html");
	
		driver.findElement(By.xpath("//input[contains(@class,'autocomplete')]")).sendKeys("A");
		
		Thread.sleep(2000);
		
		
		
	}

}
