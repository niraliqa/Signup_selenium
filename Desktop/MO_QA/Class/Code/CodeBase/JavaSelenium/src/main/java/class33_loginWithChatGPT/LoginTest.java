package class33_loginWithChatGPT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest 
{
    public static void main(String[] args) 
    {
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://freelance-learn-automation.vercel.app/login");

     
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("submit"));

        
        usernameField.sendKeys("admin@email.com");
        passwordField.sendKeys("admin@123");

        // Click the login button
        loginButton.click();

        // Wait for the login process to complete (you might need to add some explicit waits here)

        // Verify that the login is successful (you may need to adjust the assertion based on the actual behavior)
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://freelance-learn-automation.vercel.app/dashboard";

        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }

        // Additional assertions can be added based on the application's behavior

        // Close the browser
        driver.quit();
    }
}
