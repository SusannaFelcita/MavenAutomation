package testcases;

public class DataSender {
    @org.testng.annotations.DataProvider
    public Object[][] sendTestData()
    {
        Object[][] value=new Object[2][2];
        value[0][0]="Hello";
        value[0][1]="World";
        value[1][0]="Dataprovider";
        value[1][1]="Testdata";
        return value;
    }
}
