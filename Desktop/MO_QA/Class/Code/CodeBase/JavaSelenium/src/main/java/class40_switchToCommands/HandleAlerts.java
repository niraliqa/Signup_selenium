package class40_switchToCommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.Utility;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=Utility.startBrowser("https://the-internet.herokuapp.com/javascript_alerts");
		
	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
	
	Thread.sleep(2000);
	
	Alert alt=driver.switchTo().alert();
	
	String text=alt.getText();
	
	if(text.contains("JS Alert"))
	{
		System.out.println("Validation 1- Passed - Alert verified");
	}
	else
	{
		System.out.println("Validation 1- Failed - Alert Verification failed");
	}
	
	alt.accept();
	
	/*
	// ok
	alt.accept();
	
	//cancel
	alt.dismiss();

	// capture text and validate
	String alt_text=alt.getText();
	
	// enter values in confirm
	alt.sendKeys("New Category");
	
	*/
	
	}

}
