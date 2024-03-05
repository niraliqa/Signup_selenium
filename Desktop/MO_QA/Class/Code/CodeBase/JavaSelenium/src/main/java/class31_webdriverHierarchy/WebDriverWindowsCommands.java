package class31_webdriverHierarchy;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverWindowsCommands {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/documentation/webdriver/getting_started/first_script/");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*
			Options opt=driver.manage();
		
			Window win=opt.window();
		
			win.maximize();
		*/
		
		driver.manage().window().minimize();
		
		driver.manage().window().maximize();
		
		driver.manage().window().minimize();
		
		driver.quit();

	}

}
