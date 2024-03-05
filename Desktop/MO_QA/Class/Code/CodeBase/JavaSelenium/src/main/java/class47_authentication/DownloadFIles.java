package class47_authentication;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadFIles {

	public static void main(String[] args) {
		
		ChromeOptions opt=new ChromeOptions();
		
		Map<String, String> map=new HashMap<String, String>();
		
		String downloadDirectory=System.getProperty("user.dir")+"/downloadedFiles/";
		
		map.put("download.default_directory",downloadDirectory);
		
		opt.setExperimentalOption("prefs", map);
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://the-internet.herokuapp.com/download");
		
		driver.findElement(By.xpath("//a[normalize-space()='selenium-snapshot.png']")).click();
		
		File destination=new File(downloadDirectory);
		
		File []arr=destination.listFiles();
		
		System.out.println("File Count "+arr.length);
		
		if(arr.length>0)
		{
			System.out.println("Verification 1- Passed - File Downloaded");
		}
		else
		{
			System.out.println("Verification 1- Failed -Could not download the file");
		}
		
		if(arr[0].length()>0)
		{
			System.out.println("Verification 2- Passed - File Is Not Empty");
		}
		else
		{
			System.out.println("Verification 2- Failed - File Is Empty");
		}
		
		if(arr[0].delete())
		{
			System.out.println("File Deleted For Next Execution");
		}
		else
		{
			System.out.println("Could Not Delete The File");
		}
		
		driver.quit();
	}

}
