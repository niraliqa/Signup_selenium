package class39_calendar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutoSuggestions2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-autocomplete-feature-in.html");
	
		driver.findElement(By.xpath("//input[contains(@class,'autocomplete')]")).sendKeys("A");
		
		Thread.sleep(2000);
		
		List<WebElement> allSuggestions=driver.findElements(By.xpath("//ul[contains(@class,'autocomplete')]//div"));
		
		allSuggestions.get(allSuggestions.size()-2).click();
		
		
	}

}
