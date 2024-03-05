package helper;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility 
{
	
	public static WebElement getElement(WebDriver driver,By locator)
	{
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement element=	wait.until(ExpectedConditions.elementToBeClickable(locator));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		
		highlightElement(driver, element);
		
		return element;
	}
	
	
	
	public static void highlightElement(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 3px solid red;');", element);
		
		Utility.sleep(1);
		
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid black;');", element);
			
	}
	
	
	public static void sleep(int seconds)
	{
		try 
		{
			Thread.sleep(seconds*1000);
			
		} catch (InterruptedException e) 
		{
			
		}
	}
	
	
	
	public static void type(WebDriver driver,By locator,String value)
	{
		
		// please complete this method
	}
	
	public static void type(WebDriver driver,WebElement element,String value)
	{
		try 
		{
			element.sendKeys(value);
			
		} catch (Exception e) 
		{
			System.out.println("Not able to type - Trying values using JavaScriptExecutor");
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].value=arguments[1]",element,value);
		}
		
	}
	
	
	public static void clickElement(WebDriver driver,By locator)
	{
		
		// complete this method
		
	}
	
	
	public static void clickElement(WebDriver driver,WebElement ele)
	{
		
		try 
		{
			ele.click();
			
		} catch (Exception e) 
		{
			try 
			{
				System.out.println("Normal Click Failed :Trying Click Using JavaScriptExecutor");
				
				JavascriptExecutor js=(JavascriptExecutor)driver;
				
				js.executeScript("arguments[0].click()", ele);
				
			} catch (Exception e1) 
			{
				System.out.println("JS Click Failed :Trying Click Using Actions Class Click");
				
				Actions act=new Actions(driver);
				
				act.moveToElement(ele).click().build().perform();
			}
			
		}
		
	}
	
	
	
	
	
	
	public static String captureCurrentDateAndTime()
	{
		String date=new SimpleDateFormat("HH_mm_ss_dd_MM_yyyy").format(new Date());

		return date;
	}
	
	
	
	public static void captureScreenshot(WebDriver driver)
	{
		
		try 
		{
			FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("./Screenshots/Screenshot_"+Utility.captureCurrentDateAndTime()+".png"));
			
			System.out.println("Screenshot captured in Screenshots directory");
			
		} catch (WebDriverException e) 
		{
			System.out.println("Could not take the screenshot "+e.getMessage());
			
		} catch (IOException e) 
		{
			System.out.println("Could not save the screenshot "+e.getMessage());
		}

	}
	
	public static void captureScreenshotOfWebElement(WebDriver driver,WebElement ele)
	{
		
		try 
		{
			FileHandler.copy(ele.getScreenshotAs(OutputType.FILE), new File("./Screenshots/Screenshot_"+Utility.captureCurrentDateAndTime()+".png"));
			
			System.out.println("Screenshot captured for webelement in Screenshots directory");
			
		} catch (WebDriverException e) 
		{
			System.out.println("Could not take the screenshot "+e.getMessage());
			
		} catch (IOException e) 
		{
			System.out.println("Could not save the screenshot "+e.getMessage());
		}

	}
	
	
	
	
	
	
	public static void selectValueFromList(WebDriver driver,String xpathValue,String value)
	{
		
		List<WebElement> allValues=driver.findElements(By.xpath(xpathValue));
		
		for(WebElement ele:allValues)
		{
			if(ele.getText().equalsIgnoreCase(value))
			{
				ele.click();
				
				break;
			}
		}
		
		
	}
	
	public static void selectValueFromList(WebDriver driver,By locator,String value)
	{
		
		List<WebElement> allValues=driver.findElements(locator);
		
		for(WebElement ele:allValues)
		{
			if(ele.getText().equalsIgnoreCase(value))
			{
				ele.click();
				
				break;
			}
		}
		
		
	}

	
	public static WebDriver startBrowser(String appURL)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(appURL);
		
		return driver;
		
	}
	
	public static WebDriver startBrowser(String browser,String appURL,boolean cloud)
	{
		WebDriver driver=null;
		
		if(cloud)
		{
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
			
			URL hubURL;
			try 
			{
				hubURL = new URL("https://mukeshotwani.50:po9WNsa4fyaDoDaO78fMXMiWr6wlnoXZZllgq3frmg2eJzeVz4@hub.lambdatest.com/wd/hub");
				
				driver=new RemoteWebDriver(hubURL, opt);
				
			} catch (MalformedURLException e) {
				
			}
			
			
		}
		
		else
		{
			if(browser.equalsIgnoreCase("Chrome"))
			{
				ChromeOptions opt=new ChromeOptions();
				
				Map<String, String> map=new HashMap<String, String>();
				
				String downloadDirectory=System.getProperty("user.dir")+"/downloadedFiles/";
				
				map.put("download.default_directory",downloadDirectory);
				
				opt.setExperimentalOption("prefs", map);
				
				//opt.addArguments("--headless=new");
				
				//opt.addArguments("--incognito");
				
				driver=new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("Firefox"))
			{
				driver=new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("Edge"))
			{
				driver=new EdgeDriver();
			}
			else if(browser.equalsIgnoreCase("Safari"))
			{
				driver=new SafariDriver();
			}
			else
			{
				System.out.println("Sorry Currently We Do Not Support "+browser);
			}
			

		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(appURL);
		
	
		return driver;
		
		
		
	}

	public static WebDriver startBrowser(String browser,String appURL)
	{
		WebDriver driver=null;
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			ChromeOptions opt=new ChromeOptions();
			
			Map<String, String> map=new HashMap<String, String>();
			
			String downloadDirectory=System.getProperty("user.dir")+"/downloadedFiles/";
			
			map.put("download.default_directory",downloadDirectory);
			
			opt.setExperimentalOption("prefs", map);
			
			//opt.addArguments("--headless=new");
			
			//opt.addArguments("--incognito");
			
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("Safari"))
		{
			driver=new SafariDriver();
		}
		else
		{
			System.out.println("Sorry Currently We Do Not Support "+browser);
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(appURL);
		
		return driver;
		
	}
}
