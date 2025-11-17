package week4.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Scanner;

public class AutomationFormSelenium {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String name = "";
        String email = "";

        // --- Step 1: Get user input with simple validation ---
        try {
            System.out.print("Enter your name: ");
            name = sc.nextLine();

            System.out.print("Enter your email: ");
            email = sc.nextLine();

            if (name.isEmpty() || email.isEmpty()) {
                extracted();
            }
        } catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
            sc.close();
            return;
        }

        // --- Step 2: Selenium automation ---
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Load local form HTML
        	String formPath = System.getProperty("user.dir") + "/src/week4/day5/form.html";
        	formPath = "file:///" + formPath.replace("\\", "/");
        	System.out.println(formPath);

        	driver.get(formPath);

            // Wait until elements are present
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement nameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("name")));
            WebElement emailField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
            WebElement messageField = driver.findElement(By.id("message"));
            WebElement submitBtn = driver.findElement(By.id("submitBtn"));

            // Fill form
            nameField.sendKeys(name);
            emailField.sendKeys(email);
            messageField.sendKeys("Hello! This is " + name + ". My email is " + email);

            // Submit
            submitBtn.click();
            System.out.println("Form submitted successfully!");

        } catch (Exception e) {
            System.out.println("Selenium Error: " + e.getMessage());
        } finally {
            try { Thread.sleep(2000); } catch (InterruptedException ignored) {}
            driver.quit();
        }

        sc.close();
	}

	private static void extracted() throws Exception {
		throw new Exception("Name and Email cannot be empty!");
	}

}
