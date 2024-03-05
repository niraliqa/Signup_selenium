package gridDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("se:screenResolution", "1920x1080");
		
		caps.setCapability("se:recordVideo",true);
		
		caps.setCapability("browserName","firefox");
		
		//caps.setCapability("browserVersion","120.0");
		
		caps.setCapability("platformName", "linux");
		
		//EdgeOptions opt=new EdgeOptions();
		
		//opt.addArguments("--no-sandbox","--disable-dev-shm-usage","--disable-gpu","--disable-extensions");
		
		
		//opt.merge(caps);
		
		final String finalURL = "http://localhost:4444/wd/hub";
		
		URL hubURL=new URL(finalURL);
		
		WebDriverManager.chromedriver().driverVersion("120.0").setup();
		
		WebDriverManager.edgedriver().driverVersion("120.0").setup();
		
		System.out.println(SeleniumManager.getInstance().getDriverPath(new EdgeOptions(), true).getDriverPath());
		System.out.println(SeleniumManager.getInstance().getDriverPath(new FirefoxOptions(), false).getDriverPath());
		
		WebDriver driver=new RemoteWebDriver(hubURL, caps);
		
		driver.get("http://www.google.com");
		
		System.out.println("Title is "+driver.getTitle());
		
		driver.findElement(By.name("q")).sendKeys("Selenium Grid");
		
		driver.findElement(By.name("q")).clear();
		
		driver.findElement(By.name("q")).sendKeys("Selenium Grid");
		
		driver.findElement(By.name("q")).clear();
		
		driver.findElement(By.name("q")).sendKeys("Selenium Grid");
		
		driver.findElement(By.name("q")).clear();		
		
		driver.findElement(By.name("q")).sendKeys("Selenium Grid");
		
		driver.findElement(By.name("q")).clear();		
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
