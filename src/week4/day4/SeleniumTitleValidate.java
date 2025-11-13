package week4.day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTitleValidate {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String expected = "Google";
        driver.get("https://www.google.com");

        String actual = driver.getTitle();
        System.out.println("Actual title: " + actual);

        if (expected.equals(actual)) {
            System.out.println("Title matched!");
        } else {
            System.out.println("Title NOT matched!");
        }

        driver.quit();
	}

}
