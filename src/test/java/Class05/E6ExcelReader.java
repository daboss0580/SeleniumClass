package Class05;

import Utilities.Constants;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E6ExcelReader {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream(Constants.EXCEL_PATH_FILE);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        List<Map<String,String>>list1=new ArrayList<>();
        Row headerRow= sheet.getRow(0);
        for (int rows=1; rows<sheet.getPhysicalNumberOfRows();rows++){
            Row row=sheet.getRow(rows);
            Map<String,String>rowData=new HashMap<>();
            for (int col=0; col<row.getPhysicalNumberOfCells();col++) {
                String key = headerRow.getCell(col).toString();
                String value = row.getCell(col).toString();
                rowData.put(key,value);
            }
            list1.add(rowData);


        }

        System.out.println(list1);

    }
}
