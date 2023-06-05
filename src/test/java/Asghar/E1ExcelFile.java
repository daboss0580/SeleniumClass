package Asghar;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E1ExcelFile {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
        Sheet sheet=xssfWorkbook.createSheet("Sheet1");
        Row row=sheet.createRow(0);
        Cell cell=row.createCell(0);
        Cell cell1=row.createCell(1);
        cell.setCellValue("John");
        cell1.setCellValue("Henry");
        FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\reach\\IdeaProjects\\SeleniumClass\\Files\\TestExcelFiles.xlsx");
        xssfWorkbook.write((fileOutputStream));
    }
}
