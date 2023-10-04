package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static util.Reusable.*;

public class DataProvider {
    @Test(dataProvider = "sendTestData",dataProviderClass = DataSender.class)//methodname
        public void test1(String value,String value1)
        {
           WebDriver driver=openBrowser("chrome");
           openPage("https://google.com");
            driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(value+value1);

    }
}
