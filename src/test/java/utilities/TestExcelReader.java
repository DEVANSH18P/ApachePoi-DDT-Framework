package utilities;

import java.io.IOException;

public class TestExcelReader {
   public static void main(String[] args) throws IOException {
	   
	   String filePath =  "C:\\Users\\DEVANSH PRADHAN\\eclipse-workspace\\ApachePoi\\src\\test\\resources\\Apache_POI_Data_Driven_Login_Practice.xlsx";

	   ExcelReader excel = new ExcelReader(filePath, "LoginData");
	   
	   System.out.println("Rows" + excel.getRowCount());
	   System.out.println("Column" + excel.getColumnCount());
	   System.out.println("-------------");
	   for(int i=0;i<excel.getRowCount();i++) {
		   for(int j=0;j<excel.getColumnCount();j++) {
			   System.out.println(excel.getCellData(i, j)+ " |");
			   
		   }
		   System.out.println();
	   }
	   
	   excel.closeWorkBook();
	   
	   
   }
}
