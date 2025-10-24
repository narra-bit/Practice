package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSetup {

	public static void main(String[] args) {

        // 1. Creating the WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // by doing this we are getting to Open Bing Search
            driver.get("https://www.bing.com");

            // now we are printing the page title and current URL
            System.out.println("Page title: " + driver.getTitle());
            System.out.println("Current URL: " + driver.getCurrentUrl());

            // this thing basically finds search bar using By.name and enter text by using the sendKeys.
            
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Selenium WebDriver");

            // now this step is like pressing enter to Submit the search
            searchBox.submit();

            // This step actually allows wait time for the result 
            Thread.sleep(10000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // after the thread time is completed, here it automatically closes the browser
            driver.quit();
        }	
	}

}
