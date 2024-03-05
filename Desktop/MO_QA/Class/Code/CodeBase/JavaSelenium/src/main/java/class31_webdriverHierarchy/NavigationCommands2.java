package class31_webdriverHierarchy;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands2 {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/documentation/webdriver/getting_started/first_script/");
		
		driver.navigate().to("http://google.com");
		
		
	}

}
