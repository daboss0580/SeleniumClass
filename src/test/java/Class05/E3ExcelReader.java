package Class05;

import Utilities.Constants;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class E3ExcelReader {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream(Constants.EXCEL_PATH_FILE);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        Row row=sheet.getRow(1);
        Cell cell=row.getCell(0);
        System.out.println(cell);
    }
}
