package class45_capturescreenshotAndJSExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Utility;

public class JSClick5 {

	public static void main(String[] args) {
		
		WebDriver driver=Utility.startBrowser("https://login.yahoo.com/");
		
		WebElement element=driver.findElement(By.xpath("//input[@id='login-username']"));
		
		Utility.type(driver, element, "admin@email.com");
	
		WebElement element1=driver.findElement(By.id("persistent"));
		
		Utility.clickElement(driver, element1);
		
	}

}
