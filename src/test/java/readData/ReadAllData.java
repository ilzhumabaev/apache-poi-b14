package readData;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadAllData {


    File file = new File("src/test/resources/TestData.xlsx");
    XSSFWorkbook workbook;
    FileInputStream fileInputStream;
    XSSFSheet sheet1;


    @Before
    public void setUp () throws IOException {
        fileInputStream = new FileInputStream(file);

       workbook = new XSSFWorkbook(fileInputStream);
        sheet1 = workbook.getSheetAt(0);
    }

    @Test
    public void readAllDataTest() throws IOException {




        XSSFRow row1 = sheet1.getRow(0);
        XSSFRow row2 = sheet1.getRow(1);



        for (int i = sheet1.getFirstRowNum(); i < sheet1.getLastRowNum(); i++) {
            XSSFRow tempRow = sheet1.getRow(i);
            System.out.print("| ");
            for (int j = tempRow.getFirstCellNum(); j < tempRow.getLastCellNum() ; j++) {
                System.out.print( tempRow.getCell(j)+ " | ");

            }
            System.out.println();

        }


    }
}
