package testcases;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ExcelRead {
    public static void main(String[] args) throws IOException {
        Workbook wb=new XSSFWorkbook("/Users/satwikashok/Desktop/Susana/Hello.xlsx");
        Sheet sheet=wb.getSheetAt(0);
        /*Row row=sheet.getRow(0);
        Cell c=row.getCell(0);
        System.out.println(c.getStringCellValue());*/

        int rowcount=wb.getSheetAt(0).getLastRowNum();
        for(int i=0;i<=rowcount;i++)
        {
            int cellcount=wb.getSheetAt(0).getRow(i).getLastCellNum();
        for(int j=0;j<cellcount;j++){
            System.out.println(wb.getSheetAt(0).getRow(i).getCell(j).getStringCellValue());
        }
        }
    }
}
