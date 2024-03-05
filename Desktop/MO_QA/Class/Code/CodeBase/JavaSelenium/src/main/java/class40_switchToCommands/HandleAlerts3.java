package class40_switchToCommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.Utility;

public class HandleAlerts3 {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=Utility.startBrowser("https://the-internet.herokuapp.com/javascript_alerts");
	
	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
	
	Alert alt=driver.switchTo().alert();
	
	alt.sendKeys("Selenium");
	
	alt.accept();
	
	}

}
