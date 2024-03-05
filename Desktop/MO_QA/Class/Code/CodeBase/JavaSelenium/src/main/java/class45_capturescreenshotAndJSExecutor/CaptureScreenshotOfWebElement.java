package class45_capturescreenshotAndJSExecutor;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import helper.Utility;

public class CaptureScreenshotOfWebElement {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=Utility.startBrowser("https://freelance-learn-automation.vercel.app/login");
		
		WebElement element=driver.findElement(By.xpath("//button[normalize-space()='Sign in']"));
		
		File src=element.getScreenshotAs(OutputType.FILE);
		
		File destination=new File("./Screenshots/Screenshot_Element.png");
		
		FileHandler.copy(src, destination);
		
		driver.quit();
	}

}
