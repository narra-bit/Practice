package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement radio1 = driver.findElement(By.id("my-radio-1"));
        WebElement radio2 = driver.findElement(By.id("my-radio-2"));

        if (!radio2.isSelected()) {
            radio2.click();
            System.out.println("Radio Button 2 selected.");
        }

        System.out.println("Radio 1 selected? " + radio1.isSelected());
        System.out.println("Radio 2 selected? " + radio2.isSelected());

        Thread.sleep(3000);
        driver.quit();

	}

}
