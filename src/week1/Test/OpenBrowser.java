package week1.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
            
            driver.get("https://www.bing.com");

            
            System.out.println("Page title: " + driver.getTitle());
            System.out.println("Current URL: " + driver.getCurrentUrl());
            
            try {
            	Thread.sleep(10000);
            	} catch (InterruptedException e) {
            	e.printStackTrace();
            	}
            
            driver.quit();

	}

}
