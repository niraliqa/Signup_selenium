package class44_fluentWait;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import helper.Utility;

public class CaptureScreenshot3 {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver=Utility.startBrowser("Chrome","https://www.selenium.dev/");

		Utility.captureScreenshot(driver);
		
		Thread.sleep(2000);
		
		Utility.captureScreenshot(driver);
		
		Thread.sleep(2000);
		
		Utility.captureScreenshot(driver);
		
		Thread.sleep(2000);
		
		Utility.captureScreenshot(driver);
		
		driver.quit();
		
	}

}
