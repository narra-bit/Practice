package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class FindElementsSelenium {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");

        // Find all links on the page
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Print the number of links
        System.out.println("Total number of links: " + links.size());

        // Optionally print the first few link texts
        for (int i = 0; i < Math.min(5, links.size()); i++) {
            System.out.println("Link " + (i + 1) + ": " + links.get(i).getText());
        }

        driver.quit();
	}

}
