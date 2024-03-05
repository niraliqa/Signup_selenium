package class44_fluentWait;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import helper.Utility;

public class CaptureScreenshot2 {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=Utility.startBrowser("Chrome","https://www.selenium.dev/");

		FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("./Screenshots/Screenshot1.png"));
		
		driver.quit();
		
	}

}
