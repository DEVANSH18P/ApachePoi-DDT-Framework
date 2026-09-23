package dataProviders;

import java.io.IOException;


import org.testng.annotations.DataProvider;

import utilities.ExcelReader;

public class LoginDataProvider {
	
	
	@DataProvider(name = "loginData")
	public Object[][] getLoginData() throws IOException{
		   String filePath =
	                "C:\\Users\\DEVANSH PRADHAN\\eclipse-workspace\\ApachePoi\\src\\test\\resources\\Apache_POI_Data_Driven_Login_Practice.xlsx";

	        ExcelReader excel =
	                new ExcelReader(filePath, "LoginData");

	        int rows = excel.getRowCount();
	        int columns = excel.getColumnCount();	
	        
	        Object[][] data = new Object[rows - 1][columns];
	        for(int i =1;i<rows;i++) {
	        	for(int j=0;j<columns;j++) {
	        		data[i-1][j] = excel.getCellData(i, j);
	        		
	        	}
	        }
	        
	        excel.closeWorkBook();
	        return data ;
	
	}

}
