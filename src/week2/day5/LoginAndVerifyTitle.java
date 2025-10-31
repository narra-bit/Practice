package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndVerifyTitle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

        // Step 1: Navigate to demo login page
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();

        // Step 2: Locate username and password fields
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));

        // Step 3: Enter login credentials
        usernameField.sendKeys("student");
        passwordField.sendKeys("Password123");

        // Step 4: Locate and click the login button
        WebElement loginButton = driver.findElement(By.id("submit"));
        loginButton.click();

        // Wait for navigation
        Thread.sleep(10000);

        // Step 5: Verify page title
        String expectedTitle = "Logged In Successfully | Practice Test Automation";
        String actualTitle = driver.getTitle();

        System.out.println("Expected Title: " + expectedTitle);
        System.out.println("Actual Title: " + actualTitle);

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Login successful – Title matched!");
        } else {
            System.out.println("Login failed – Title did not match!");
        }

        // Step 6: Close the browser
        driver.quit();

	}

}
