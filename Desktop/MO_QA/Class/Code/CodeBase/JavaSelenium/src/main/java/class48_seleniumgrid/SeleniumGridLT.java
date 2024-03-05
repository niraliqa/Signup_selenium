package class48_seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridLT {

	/*   
	 *   you can use latest keyword to get latest browser version
	 *   latest 121
		 latest-1 =120
		 latest-2 =119
	 * 
	 */
	
	public static void main(String[] args) throws MalformedURLException {
		
		ChromeOptions opt=new ChromeOptions();
		
		opt.setPlatformName("macOS Catalina");
		
		opt.setBrowserVersion("121.0");
		
		HashMap<String, Object> map=new HashMap<String, Object>();
		
		map.put("username", "mukeshotwani.50");
		
		map.put("accessKey", "po9WNsa4fyaDoDaO78fMXMiWr6wlnoXZZllgq3frmg2eJzeVz4");
		
		map.put("w3c", true);
		
		map.put("visual", true);
		
		map.put("network", true);
		
		map.put("project", "Selenium Tests On Cloud");
		
		opt.setCapability("LT:Options", map);
		
		URL hubURL=new URL("https://mukeshotwani.50:po9WNsa4fyaDoDaO78fMXMiWr6wlnoXZZllgq3frmg2eJzeVz4@hub.lambdatest.com/wd/hub");
		
		WebDriver driver=new RemoteWebDriver(hubURL, opt);
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("admin@email.com");
		
		driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("admin@123");
		
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		
		driver.quit();
		

	}

}
