package class35_dropdownSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		
		Thread.sleep(5000);
		
		List<WebElement> allCheckbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		WebElement element=allCheckbox.get(0);
		
		element.click();
		
		driver.findElements(By.xpath("//input[@type='checkbox']")).get(1).click();
		
		driver.findElements(By.xpath("//input[@type='checkbox']")).get(allCheckbox.size()-1).click();
		
		
	}

}
