package class32_webElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands3 {

	/*
	 *  Complete login scenario
	 *  	username - admin@email.com
	 *  	password - admin@123
	 * 
	 */
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
	
		driver.findElement(By.id("email1")).sendKeys("admin@email.com");
		
		
		
	}

}
