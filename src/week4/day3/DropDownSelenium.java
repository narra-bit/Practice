package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().window().maximize();
        Thread.sleep(4000);

        // Locate dropdown element
        WebElement dropdown = driver.findElement(By.name("my-select"));
        Select select = new Select(dropdown);

        // Select options
        select.selectByVisibleText("Two");     
        Thread.sleep(3000);
        select.selectByValue("3");             
        Thread.sleep(3000);
        select.selectByIndex(1);               
        System.out.println(" Dropdown options selected successfully.");

        driver.quit();

	}

}
