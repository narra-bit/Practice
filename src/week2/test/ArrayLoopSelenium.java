package week2.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayLoopSelenium {

	public static void main(String[] args) throws InterruptedException {
		String[][] sites = {
		        {"https://www.bing.com", "Bing"},
		        {"https://www.youtube.com", "YouTube"},
		        {"https://github.com", "GitHub"}
		};

		WebDriver driver = new ChromeDriver();

		for (int n = 0; n < sites.length; n++) {
		    String url = sites[n][0];
		    String expectedTitle = sites[n][1];

		    driver.get(url);
		    Thread.sleep(5000); 

		    String actualTitle = driver.getTitle();
		    System.out.println("Opened: " + url);
		    System.out.println("Expected: " + expectedTitle + " | Actual: " + actualTitle);

		   
		    if (actualTitle.contains(expectedTitle)) {
		        System.out.println("Title matches for " + expectedTitle);
		    } else {
		        System.out.println("Title mismatch for " + expectedTitle);
		    }

		   System.out.println();
		}

		driver.quit();
		System.out.println("Test is completed successfully.");
	}

}
