package class48_seleniumgrid;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.Utility;

public class SeleniumGridLT2 {

	/*   
	 *   you can use latest keyword to get latest browser version
	 *   latest 121
		 latest-1 =120
		 latest-2 =119
	 * 
	 */
	
	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver= Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login", true);
	
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("admin@email.com");
		
		driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("admin@123");
		
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		
		driver.quit();
		

	}

}
