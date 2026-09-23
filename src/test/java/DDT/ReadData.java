package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

    public static void main(String[] args) throws IOException {
        String expath = "C:\\Users\\DEVANSH PRADHAN\\eclipse-workspace\\ApachePoi\\testdata.xlsx";
        
        FileInputStream fis = new FileInputStream(expath);
        XSSFWorkbook wb = new XSSFWorkbook(fis);

        // .getCell(4) already selects column index 4. Use .getStringCellValue() to get the text:
        String val = wb.getSheet("sheet3").getRow(2).getCell(3).getStringCellValue();
        
        System.out.println(val);

        wb.close();
        fis.close();
    }
}