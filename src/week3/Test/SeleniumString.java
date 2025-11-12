package week3.Test;

import java.time.Duration;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumString {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();

        // Step 2: Apply String methods
        String fullName = firstName.trim() + " " + lastName.trim();
        String upperName = fullName.toUpperCase();
        int length = fullName.length();
        String subName = fullName.substring(0, Math.min(5, fullName.length()));

        System.out.println(" String Analysis:");
        System.out.println("Full Name: " + fullName);
        System.out.println("Uppercase: " + upperName);
        System.out.println("Length: " + length);
        System.out.println("Substring(0-5): " + subName);

        WebDriver driver = new ChromeDriver();

        try {
            
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        	driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        	
        	WebElement textBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("my-text")));
        	textBox.sendKeys(fullName);

        	
        	WebElement textArea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("my-textarea")));
        	textArea.sendKeys("Uppercase: " + upperName + " | Length: " + length);

        	
        	wait.until(ExpectedConditions.elementToBeClickable(By.id("my-check-1"))).click();
        	wait.until(ExpectedConditions.elementToBeClickable(By.id("my-radio-2"))).click();
        	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button"))).click();

        	System.out.println("\n Form submitted successfully!");
        	Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            driver.quit();
            sc.close();
        }
        	
	}

}