package class46_JSDemoOptionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Utility;

public class ElementHighLight {

	public static void main(String[] args) throws InterruptedException {
		
		
	WebDriver driver=Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");

	WebElement element=driver.findElement(By.xpath("//input[@id='email1']"));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 3px solid red;');", element);
	
	Utility.captureScreenshot(driver);
	
	Thread.sleep(1000);
	
	js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid black;');", element);
	
	element.clear();
	
	element.sendKeys("Selenium");
	
	}

}
