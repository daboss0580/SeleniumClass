package Class05;

import Utilities.Constants;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E5ExcelReader {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream(Constants.EXCEL_PATH_FILE);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");


        for (int rows=0; rows<sheet.getPhysicalNumberOfRows();rows++){
            Row row=sheet.getRow(rows);
            for (int col=0; col<row.getPhysicalNumberOfCells();col++)
            System.out.print(row.getCell(col)+" ");
            System.out.println();
        }


    }
}
