package class43_explicitWaitInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Utility;

public class ExplicitWaitDemo5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=Utility.startBrowser("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		// partial match
		wait.until(ExpectedConditions.titleContains("Selenium"));
		
		// complete match
		wait.until(ExpectedConditions.titleIs("Welcome To Selenium"));
		
		// WebElement count
		wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//input[@id='selenium']"), 5));
		
		wait.until(ExpectedConditions.urlContains("signup"));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		
		// u can avoid since elementToBeClickable check present +visible+enable
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath(""))));
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
		
		wait.until(ExpectedConditions.textToBe(By.id(""), "Tran completed"));
		
		
	}

}
