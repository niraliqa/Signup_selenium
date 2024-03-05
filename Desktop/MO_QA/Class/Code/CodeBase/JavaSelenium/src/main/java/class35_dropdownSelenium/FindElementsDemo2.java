package class35_dropdownSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
	}

}
