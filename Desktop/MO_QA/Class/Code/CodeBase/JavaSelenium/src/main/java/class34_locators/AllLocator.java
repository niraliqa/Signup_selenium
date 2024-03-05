package class34_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocator {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.findElement(By.name("email1")).sendKeys("admin@email.com");
		driver.findElement(By.name("password1")).sendKeys("admin@123");
		driver.findElement(By.className("submit-btn")).click();
		
	}

}
