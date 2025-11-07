package week3.day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

        // Navigate to first site
        driver.get("https://www.google.com");
        System.out.println("Opened Google");

        Thread.sleep(5000);
        driver.navigate().to("https://www.wikipedia.org");
        System.out.println("Navigated to Wikipedia");

        Thread.sleep(5000);
        driver.navigate().back();
        System.out.println("Navigated Back to Google");

        Thread.sleep(5000);
        driver.navigate().forward();
        System.out.println("Navigated Forward to Wikipedia");

        Thread.sleep(5000);
        driver.navigate().refresh();
        System.out.println("Page Refreshed");

        driver.quit();

	}

}
