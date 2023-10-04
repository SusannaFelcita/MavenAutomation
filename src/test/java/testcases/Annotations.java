package testcases;

import org.testng.annotations.*;

public class Annotations {
    @Test
    public void tc1() {
        System.out.println("TestNG");
    }
    @Test
    public void tc2() {
        System.out.println("Program");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Before method");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("after method");
    }

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Before class");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("after class");
    }
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Before test");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("after test");
    }
    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("Before suite");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("after suite");
    }


}