package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static util.Reusable.openBrowser;

public class testNGparent
{
    WebDriver driver;

    @BeforeMethod
    public void beforeTest()
    {

        driver=openBrowser("chrome");
    }

    @AfterMethod
    public void afterTest()
    {

        driver.manage().window().maximize();
    }
}
