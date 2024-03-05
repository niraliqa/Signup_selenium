package class49_keyboardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import helper.Utility;

public class KeyboardEvents {

	public static void main(String[] args) {
		
		WebDriver driver=Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		
		Actions act=new Actions(driver);
		
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("admin@email.com");

		act.sendKeys(Keys.TAB)
		.pause(2000)
		.sendKeys("admin@123")
		.pause(1000)
		.sendKeys(Keys.ENTER)
		.build()
		.perform();
		
	}

}
