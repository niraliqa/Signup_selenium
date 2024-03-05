package class48_seleniumgrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import helper.Utility;

public class ActionsClass {

	public static void main(String[] args) {
		
		/*
		 *  Complex actions/gesture
		 *  		double click
		 *  		right click
		 *  		mouse hover
		 *  		drag and drop	
		 *  		keyboard
		 */
		
		WebDriver driver=Utility.startBrowser("Chrome","https://jqueryui.com/droppable/");
	
		WebElement frameElement=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frameElement);
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
	
	}

}
