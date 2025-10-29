package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomation {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver = new ChromeDriver();

        // Navigate to sample login page
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Locate username and password input fields using XPath
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

        // Enter login credentials
        username.sendKeys("student");
        password.sendKeys("Password123");

        // Locate and click the Login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@id='submit']"));
        loginButton.click();

        // Wait for page to load
        Thread.sleep(2000);

        // Verify successful login by checking new page element or title
        String successMsg = driver.findElement(By.xpath("//h1")).getText();
        if (successMsg.contains("Logged In Successfully")) {
            System.out.println("Login test passed!");
        } else {
            System.out.println("Login test failed!");
        }

        // Close the browser
        driver.quit();

	}

}
