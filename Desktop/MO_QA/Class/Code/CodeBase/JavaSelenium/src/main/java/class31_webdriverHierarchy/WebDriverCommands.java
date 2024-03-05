package class31_webdriverHierarchy;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver=new ChromeDriver();
		
	   // WebDriver Commands / Methods
		
		driver.get("https://www.selenium.dev/documentation/webdriver/getting_started/first_script/");
		
		String title=driver.getTitle();
		
		System.out.println("Title is "+title);
		
		driver.close();
		
		String url=driver.getCurrentUrl();
		
		System.out.println("Url is "+url);
		
		String pageSource=driver.getPageSource();
		
		//System.out.println("Page Source is "+pageSource);
		
		//quit will close all associated windows/tabs
		
		
		// will close only current active window
		//driver.close();

	}

}
