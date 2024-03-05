package class34_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocator2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		driver.findElement(By.linkText("New user? Signup")).click();
		
		driver.findElement(By.partialLinkText("New user")).click();
		
	}

}
