package class40;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Utility;



public class ManageCourse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		WebDriver driver = Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("admin@email.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		System.out.println("Signin complete");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[contains(@class,'nav-menu-item-manage')]")).click();
		Thread.sleep(2000);
		
		WebElement wjs = driver.findElement(By.xpath("//a[text()='Manage Courses']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",  wjs);
	
		System.out.println("Add");
		
		Thread.sleep(2000);
		
		System.out.println("Add1");
	//	WebElement popupElement = driver.findElement(By.xpath("//div[@class='modal-content']"));
    //    System.out.println("Text in Pop-up: " + popupElement.getText());
		driver.findElement(By.xpath("//button[text()='Add New Course ']")).click();
	
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='thumbnail']")).sendKeys("C:\\Users\\anira\\Desktop\\MO_QA\\Image\\istockphoto-1163061322-612x612.jpg");
	
        
  	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Aarav Ramkrishana");
  	
  	//Description 
  	driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("API is the future!!");
  	
  	//Instructor Name
  	driver.findElement(By.xpath("//input[@id='instructorNameId']")).sendKeys("Mukesh");
  	
  	//course price
  	driver.findElement(By.xpath("//input[@id='price']")).sendKeys("32300");
  	
  	//select Date
  //	driver.findElement(By.xpath("//input[@name='startDate']")).click();
  //	WebElement date = driver.findElement(By.xpath("div[contains(@class,'datepicker__month') and @role='listbox']//div[contains(@class,'datepicker__day')]"));
  	
  	//List<WebElement> month = driver.findElements(By.xpath("//div[@class='react-datepicker__month-container']"));
  	
  	
  	driver.findElement(By.xpath("//input[@name='startDate']")).click();
  	
  	
  	Thread.sleep(2000);
  	
  	Utility.selectValueFromList(driver, "//div[contains(@class,'datepicker__month') and @role='listbox']//div[contains(@class,'datepicker__day')]", "30");
  	
	/*List<WebElement> month = 
	driver.findElements(By.xpath("div[contains(@class,'datepicker__month') and @role='listbox']//div[contains(@class,'datepicker__day')]"));

  	for(WebElement ele : month)
  	{
  		String date = ele.getText();
  		if(date.equalsIgnoreCase("30"))
  		{
  			ele.click();
  			break;
  		}
  	}
  	*/
  	
  	//select end date   endDate
  	driver.findElement(By.xpath("//input[@name='endDate']")).click(); 
  	
  	Thread.sleep(2000);
  	
  	
  	List<WebElement> endmonth = driver.findElements(By.xpath("//div[contains(@class,'react-datepicker__month')and@role='listbox']//div[contains(@class,'react-datepicker')]/div"));
  	
  	System.out.println("New Dates  Count "+endmonth.size());
  	
  	for(WebElement endele : endmonth)
  	{
  		String endDate= endele.getText();
  		
  		System.out.println(endele.getAttribute("innerHTML"));
  		
  		System.out.println("new dates "+endDate);
  		
  		if(endDate.equalsIgnoreCase("26")) 
  		{
  			endele.click();
  			
  			break;
  		}
  	}
  	
  	
  	//select catagory
  	driver.findElement(By.xpath("//div[text()='Select Category']")).click();
  	
  	driver.findElement(By.xpath("//button[text()='Java']")).click();
  	
  
	
	}

}
