package class40_switchToCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.Utility;

public class HandleAlerts2 {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=Utility.startBrowser("https://the-internet.herokuapp.com/javascript_alerts");
	
	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
	
	driver.switchTo().alert().dismiss();
	
	}

}
