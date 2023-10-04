package util;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Reusable {

    static WebDriver driver;
    public static WebDriver openBrowser(String browser) {
        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                throw new InvalidArgumentException("Invalid Browser name");
        }

        driver.manage().window().maximize();
        return driver;//end of method
    }
        public static void openPage(String url)
        {

            driver.get(url);
        }

    }