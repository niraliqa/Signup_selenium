package class35_dropdownSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		
		Thread.sleep(5000);
		
		WebElement dropdown=driver.findElement(By.id("state"));
		
		
		
		Select state=new Select(dropdown);
		
		
		
		
		//third
		state.selectByIndex(5);
		
		Thread.sleep(2000);
		
		//second
		state.selectByValue("Karnataka");
		
		Thread.sleep(2000);
		
		// first preference
		state.selectByVisibleText("Goa");
		
		
		

	}

}
