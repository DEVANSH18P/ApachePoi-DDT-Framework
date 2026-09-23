package utilities;

import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ExcelReader {

	
		// TODO Auto-generated method stub
		
		private XSSFWorkbook workbook;
		private XSSFSheet sheet;
		public ExcelReader(String filePath, String sheetName) throws IOException {
			FileInputStream file = new FileInputStream(
				    "C:\\Users\\DEVANSH PRADHAN\\eclipse-workspace\\ApachePoi\\src\\test\\resources\\Apache_POI_Data_Driven_Login_Practice.xlsx"
				);
			
			workbook = new XSSFWorkbook(file);
			sheet = workbook.getSheet("LoginData");
			
		}
		
		// get no of rows
		
		public int getRowCount() {
			return sheet.getPhysicalNumberOfRows();
		}
      // get no of rows
		
		public int getColumnCount() {
			return sheet.getRow(0).getLastCellNum();
			
		}
		
		// Reading cell data
		public String getCellData(int row ,int column) {
			DataFormatter formatter = new DataFormatter();
			 return formatter.formatCellValue(sheet.getRow(row).getCell(column));
		}
		
		// close WorkBook
		public void closeWorkBook()throws IOException {
			workbook.close();
			
		}
	}


