package class46_JSDemoOptionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.Utility;

public class LoginScript {

	public static void main(String[] args) throws InterruptedException {
		
		
	WebDriver driver=Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");

	Utility.getElement(driver, By.xpath("//input[@id='email1']")).sendKeys("admin@email.com");
	
	Utility.getElement(driver, By.xpath("//input[@id='password1']")).sendKeys("admin@123");
	
	Utility.getElement(driver, By.className("submit-btn")).click();
	
	}

}
