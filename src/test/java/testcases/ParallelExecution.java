package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static util.Reusable.openBrowser;
import static util.Reusable.openPage;

public class ParallelExecution extends testNGparent{
    @Test
    public void login()
    {

        openPage("https://facebook.com");
        driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("susana felcita");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("hello");
        driver.findElement(By.xpath("//button[@name='login']")).click();


    }

    @Test
    public void googletest()
    {

        openPage("https://google.com");
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("SRK");    }
}
