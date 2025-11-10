package week3.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;

public class StringAnalysisForms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Step 1: User input
        System.out.print("Enter a sentence for analysis: ");
        String input = sc.nextLine();

        // Step 2: String analysis
        int vowels = 0, consonants = 0, words = 0;
        String lower = input.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        String[] wordArray = input.trim().split("\\s+");
        words = wordArray.length;

        System.out.println("\nString Analysis Result:");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Word Count: " + words);

        // Step 3: Launch browser
        WebDriver driver = new ChromeDriver();

        try {
            // Step 4: Open sample form website
            driver.get("https://www.selenium.dev/selenium/web/web-form.html");

            // Step 5: Fill form fields using analyzed data
            WebElement textBox = driver.findElement(By.name("my-text"));
            textBox.sendKeys("Sentence: " + input);

            WebElement textArea = driver.findElement(By.name("my-textarea"));
            textArea.sendKeys("Vowels: " + vowels + ", Consonants: " + consonants + ", Words: " + words);

            // Optional: select checkbox and radio
            driver.findElement(By.id("my-check-1")).click();
            driver.findElement(By.id("my-radio-2")).click();

            // Step 6: Submit form
            driver.findElement(By.cssSelector("button")).click();

            // Step 7: Print confirmation message
            System.out.println("\n Form submitted successfully!");
            Thread.sleep(5000); // wait to visually confirm
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            driver.quit();
            sc.close();
        }

	}

}
