package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        
        WebElement checkbox1 = driver.findElement(By.id("my-check-1"));
        WebElement checkbox2 = driver.findElement(By.id("my-check-2"));

        
        if (!checkbox1.isSelected()) {
            checkbox1.click();
            System.out.println("Checkbox 1 selected.");
        }

        if (!checkbox2.isSelected()) {
            checkbox2.click();
            System.out.println("Checkbox 2 selected.");
        }
        System.out.println("Checkbox 1 selected? " + checkbox1.isSelected());
        System.out.println("Checkbox 2 selected? " + checkbox2.isSelected());

        Thread.sleep(3000);
        driver.quit();

	}

}
