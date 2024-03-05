package class42_switchToFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.Utility;

public class HandleFrames2 {

	public static void main(String[] args) 
	{
		
		WebDriver driver=Utility.startBrowser("https://www.rediff.com/");

		driver.switchTo().frame("mukesh");
	
		String bseIndex=driver.findElement(By.id("bseindex")).getText();
		
		System.out.println("Current Index Value is "+bseIndex);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		
	}

}
