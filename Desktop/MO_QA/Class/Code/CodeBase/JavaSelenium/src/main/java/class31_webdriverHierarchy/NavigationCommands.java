package class31_webdriverHierarchy;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/documentation/webdriver/getting_started/first_script/");
		
		driver.get("https://learn-automation.com/");
		
		driver.get("http://google.com");
	
	/*	
		Navigation nav=driver.navigate();
		
		nav.back();
		
		nav.forward();
		
		nav.refresh();
	*/	
		
		// Navigation commands
		
		driver.navigate().back();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.navigate().to("http://google.com");
		
		
	}

}
