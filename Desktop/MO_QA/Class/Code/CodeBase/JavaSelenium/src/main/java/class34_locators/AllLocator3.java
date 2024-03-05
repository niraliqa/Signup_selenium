package class34_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocator3 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("admin@email.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin@123");
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
	}

}
