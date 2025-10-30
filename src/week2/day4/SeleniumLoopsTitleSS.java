package week2.day4;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class SeleniumLoopsTitleSS {

    public static void main(String[] args) throws IOException {
        // Initialize Chrome browser
        WebDriver driver = new ChromeDriver();

        // URLs and Expected Titles
        String[][] sites = {
            {"https://www.google.com", "Google"},
            {"https://www.selenium.dev", "Selenium"},
            {"https://www.wikipedia.org", "Wikipedia"},
            {"https://www.yahoo.com", "Yahoo"}
        };

        // Loop through each site
        for (String[] site : sites) {
            String url = site[0];
            String expectedTitle = site[1];

            driver.get(url);
            driver.manage().window().maximize();

            String actualTitle = driver.getTitle();
            System.out.println("\nVisiting: " + url);
            System.out.println("Actual Title: " + actualTitle);
            System.out.println("Expected Title: " + expectedTitle);

            if (actualTitle.equalsIgnoreCase(expectedTitle)) {
                System.out.println("Title matched!");
            } else {
                System.out.println("Title did NOT match. Taking screenshot...");
                takeScreenshot(driver, expectedTitle + "_Failed");
            }
        }

        driver.quit();
        System.out.println("\nBrowser closed. Test completed.");
    }

    public static void takeScreenshot(WebDriver driver, String fileName) throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Folder: Screenshots/yyyy-MM-dd/
        String dateFolder = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String folderPath = System.getProperty("user.dir") + File.separator + "Screenshots" + File.separator + dateFolder;

        File folder = new File(folderPath);
        if (!folder.exists()) folder.mkdirs();

        String timestamp = new SimpleDateFormat("HHmmss").format(new Date());
        File dest = new File(folderPath + File.separator + fileName + "_" + timestamp + ".png");

        FileUtils.copyFile(src, dest);
        System.out.println("Screenshot saved at: " + dest.getAbsolutePath());
    }
}