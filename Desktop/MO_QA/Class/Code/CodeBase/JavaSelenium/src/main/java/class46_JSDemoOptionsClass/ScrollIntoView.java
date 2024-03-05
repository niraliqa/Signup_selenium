package class46_JSDemoOptionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Utility;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		
		
	WebDriver driver=Utility.startBrowser("Chrome", "https://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");

	WebElement element=driver.findElement(By.xpath("//textarea"));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].scrollIntoView(true)", element);
	
	Thread.sleep(2000);
	
	element.clear();
	
	element.sendKeys("Selenium");
	
	}

}
