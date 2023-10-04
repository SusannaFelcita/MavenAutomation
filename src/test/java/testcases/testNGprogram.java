package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static util.Reusable.*;


public class testNGprogram extends testNGparent
{

    @Test()
    public static void yahoo()
    {

        openPage("https://yahoo.com");

    }
        @Test(dependsOnMethods = "gmail",alwaysRun = true)//calls gmail 1st even though priority is 3
        public static void facebook()
        {
            openPage("https://facebook.com");
        }

    @Test()
    public static void gmail()
    {

        openPage("https://www.google.com/gmail/about/");
        //Assert.assertEquals(true,false);
    }
}
