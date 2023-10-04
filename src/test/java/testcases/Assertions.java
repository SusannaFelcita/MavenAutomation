package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Assertions {

    @Test
    public void comparison()
    {
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://google.com");
        String Title=driver.getTitle();
        String Expected="GOOGLE";
        Assert.assertEquals(Expected,Title);
    }

}
