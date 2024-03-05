package class42_switchToFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitsInSelenium {

	public static void main(String[] args) {
		
		/*
		 *  Increasing the implicit wait timeout should be used judiciously as it will have an adverse effect on test run time, 
		 *  especially when used with slower location strategies like XPath.
		 * 
		 */
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("Mukesh")).sendKeys("Selenium");

	}

}
