package class35_dropdownSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		
		Thread.sleep(5000);
			
		Select state=new Select(driver.findElement(By.id("state")));
	
		state.selectByVisibleText("Goa");
		
		String stateName=state.getFirstSelectedOption().getText();
		
		if(stateName.contains("Goa"))
		{
			System.out.println("Dropdown is working as expected");
		}
		else
		{
			System.out.println("Dropdown is not working as expected");
		}
		

	}

}
