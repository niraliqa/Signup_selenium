package class46_JSDemoOptionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.Utility;

public class ScrollTillEnd {

	public static void main(String[] args) {
		
		
		WebDriver driver= Utility.startBrowser("Chrome", "https://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");

		driver.findElement(By.xpath("//a[normalize-space()='Project on Github']")).click();
		
	}

}
