package java_selenium_Thus;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//WebDriver driver = new ChromeDriver();
WebDriver driver = new FirefoxDriver();
driver.get("https://freelance-learn-automation.vercel.app/login");
Thread.sleep(2000);
driver.manage().window().maximize();
driver.getTitle();
String url = driver.getCurrentUrl();
if(url.contains("login"))
{
	System.out.print("URL contains Login");
}else 
{
	System.out.print("URL does not contain Login");
}

driver.findElement(By.xpath("//button[text()='Sign in']")).click();
//Thread.sleep(2000);

WebElement errormsg= driver.findElement(By.xpath("//h2[text()='Email and Password is required']")); 

String errorm = errormsg.getText();
if(errorm.equalsIgnoreCase("Email and Password is required"))
{
	System.out.println("Validation is passed");
}
else
{
	System.out.println("Validation is failed");
}

//Click on New user? Signup link Verify url contains signup

driver.findElement(By.linkText("New user? Signup")).click();
Thread.sleep(3000);
String urlsignup = driver.getCurrentUrl();
if(urlsignup.contains("signup"))
{
	System.out.println("Signup page validation passed!!");
}else 
{
	System.out.println("Signup page validation Failed!!");
}
//Verify Signup button is disabled
WebElement signup = driver.findElement(By.xpath("//button[text()='Sign up']"));
	if (!signup.isEnabled()) 
	{
		System.out.println("signup buttom disable");	
	}else {
		System.out.println("signup buttom enable");
	}
	
	/*
	 * Enter name
Enter email
Enter password



Select first and last hobby
Verify Signup button is enabled
Click on Signup button 
	 */
	driver.findElement(By.id("name")).sendKeys("Studentall02");
	driver.findElement(By.id("email")).sendKeys("Studentall02@email.com");
	driver.findElement(By.id("password")).sendKeys("admin@123");
List<WebElement> sub =	driver.findElements(By.xpath("//input[@type='checkbox']"));

//Select Selenium checkbox
	driver.findElement(By.xpath("//label[text()='Selenium']//preceding::input[1]")).click();
	
//Select gender
	 driver.findElement(By.id("gender2")).click();

	//Select any state
	WebElement stat = driver.findElement(By.id("state"));
	Select state = new Select(stat);
	 state.selectByVisibleText("Chhattisgarh");
	 WebElement snam = state.getFirstSelectedOption();
	 String s1name = snam.getText();
	if(s1name.equals("Chhattisgarh"))
	{
		System.out.println("correct state got selected");
	}else {
		System.out.println("wrong state selected");
	}
	
	Thread.sleep(5000);
	//Select first and last hobby
	WebElement hobbie = driver.findElement(By.xpath("//select[@id='hobbies']"));
	Select hobset = new Select(hobbie);
	Thread.sleep(2000);
	hobset.selectByVisibleText("Playing");
	hobset.selectByVisibleText("Dancing");
		
	Thread.sleep(2000);
	
	
	WebElement signupEnable = driver.findElement(By.xpath("//button[@type='submit']"));
	if (signupEnable.isEnabled()) 
	{
		System.out.println("signup buttom enable");	
	}else {
		System.out.println("signup buttom Disable");
	}
	signupEnable.click();
	Thread.sleep(2000);
	
	System.out.print("***");
	
	//verifying after Signup message
	WebElement signdon = driver.findElement(By.xpath("//div[text()='Signup successfully, Please login!']"));
	String donemsg = signdon.getText();
	Thread.sleep(2000);
	/*if(donemsg.contains("Signup successfully, Please login!"))
	{
		System.out.print("Signup Successfull");
	}
	else
	{
		System.out.println("Signup Failed");
	}*/
	driver.get("https://freelance-learn-automation.vercel.app/login");
	driver.findElement(By.id("email1")).sendKeys("Studentall@email.com");
	driver.findElement(By.id("password1")).sendKeys("admin@123");
	Thread.sleep(2000);
	driver.findElement(By.className("submit-btn")).click();
	
	
	Thread.sleep(2000);
	String urlin = driver.getCurrentUrl();
	System.out.println(urlin);
	if(urlin.contains("app/"))
	{
		System.out.print("Sign in account passed");
	}
	else 
	{
		System.out.print("Sign in account Failed");
	}
Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@src='/static/media/burger-menu.93a4e66d6d393af53ac4ed46e5193397.svg']")).click();
	
	driver.findElement(By.xpath("//button[text()='Sign out']")).click();

	
	
	driver.quit();
	
	}

}
