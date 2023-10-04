package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.Reusable;

import static util.Reusable.*;


public class SampleTest {
    public static void main(String[] args) {

        WebDriver driver= openBrowser("chrome");
        openPage("https://google.com");
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("hello world");

    }

}
