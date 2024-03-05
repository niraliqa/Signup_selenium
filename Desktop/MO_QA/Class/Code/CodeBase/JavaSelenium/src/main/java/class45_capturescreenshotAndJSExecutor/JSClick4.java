package class45_capturescreenshotAndJSExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Utility;

public class JSClick4 {

	public static void main(String[] args) {
		
		WebDriver driver=Utility.startBrowser("https://login.yahoo.com/");

		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement element=driver.findElement(By.xpath("//input[@id='login-username']"));
		
		js.executeScript("arguments[0].value=arguments[1]",element,"admin@email.com");
	
		WebElement element1=driver.findElement(By.id("persistent"));
		
		Utility.clickElement(driver, element1);
		
	
	}

}
