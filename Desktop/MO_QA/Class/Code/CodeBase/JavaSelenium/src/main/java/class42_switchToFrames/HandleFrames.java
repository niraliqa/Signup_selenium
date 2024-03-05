package class42_switchToFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.Utility;

public class HandleFrames {

	public static void main(String[] args) 
	{
		
		WebDriver driver=Utility.startBrowser("https://www.rediff.com/");
		
		// Index - Not Recommended
		//driver.switchTo().frame(0);
		
		// name or id- recommended only when it is unique
		//driver.switchTo().frame("moneyiframe");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'moneywizwidget')]")));
		
		String bseIndex=driver.findElement(By.id("bseindex")).getText();
		
		System.out.println("Current Index Value is "+bseIndex);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		
	}

}
