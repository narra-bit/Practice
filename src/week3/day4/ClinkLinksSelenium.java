package week3.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class ClinkLinksSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");

        // Find all links on the page
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total Links Found: " + links.size());

        // Click first 5 links (as an example)
        for (int i = 0; i < Math.min(5, links.size()); i++) {
            WebElement link = links.get(i);
            String linkText = link.getText();
            System.out.println("Clicking on link: " + linkText);
            link.click();

            // Re-locate element before each click to avoid stale element exceptions
            
            Thread.sleep(2000);
            driver.navigate().back(); // Go back to main page
            Thread.sleep(2000);
            
            links = driver.findElements(By.tagName("a"));
        }

        driver.quit();
	}

}
