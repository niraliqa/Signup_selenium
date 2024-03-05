package class43_explicitWaitInSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import helper.Utility;

public class ExplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=Utility.startBrowser("https://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		driver.findElement(By.xpath("//button[normalize-space()='Try it']")).click();
	
		for(int i=0;i<15;i++)
		{
			try 
			{
				Alert alt=driver.switchTo().alert();
				
				String alt_text=alt.getText();
				
				if(alt_text.contains("Selenium"))
				{
					System.out.println("Text Validated");
				}
				else
				{
					System.out.println("Could Not  Validate The Text");
				}
				break;
			}
			catch(NoAlertPresentException e)
			{
				System.out.println("Alert not present - waiting for alert to appear ");
			}
			
			Thread.sleep(500);
			
		}
		
		
		
		driver.quit();
	}

}
