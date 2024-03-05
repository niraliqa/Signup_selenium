package class43_explicitWaitInSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Utility;

public class ExplicitWaitDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=Utility.startBrowser("https://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		driver.findElement(By.xpath("//button[normalize-space()='Try it']")).click();
	
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		
		Alert alt=wait.until(ExpectedConditions.alertIsPresent());
		
		if(alt.getText().contains("Selenium"))
		{
			System.out.println("Text Validated");
		}
		else
		{
			System.out.println("Could Not Validate The Text");
		}
		
		alt.accept();
		
		driver.quit();
	}

}
