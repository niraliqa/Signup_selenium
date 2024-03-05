package class45_capturescreenshotAndJSExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Utility;

public class JSClick2 {

	public static void main(String[] args) {
		
		WebDriver driver=Utility.startBrowser("https://login.yahoo.com/");

		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin@yahoo.com");
		
		WebElement element=driver.findElement(By.id("persistent"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click()",element);
		
	
	}

}
