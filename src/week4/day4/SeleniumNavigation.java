package week4.day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumNavigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String[][] sites = {
                {"https://www.google.com", "Google"},
                {"https://www.bing.com", "Bing"},
        };

        for (String[] site : sites) {

            try {
                driver.get(site[0]);
                Thread.sleep(3000);  // WAIT so browser does not crash

                String expected = site[1];
                String actual = driver.getTitle();

                System.out.println("\nOpened: " + site[0]);
                System.out.println("Expected Title: " + expected);
                System.out.println("Actual Title: " + actual);

                if (actual.contains(expected)) {
                    System.out.println("Title Verified!");
                } else {
                    System.out.println("Title NOT matching!");
                }

            } catch (Exception e) {
                System.out.println("Error for: " + site[0]);
                e.printStackTrace();
            }
        }
        driver.quit();
	}

}
