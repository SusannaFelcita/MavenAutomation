package testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNGparameters {
    @Test
    @Parameters(value={"test","x","test1"})
    public void test(String value,int x,String value1)
    {
        System.out.println(value);
        System.out.println(x);
        System.out.println(value1);
    }
}
