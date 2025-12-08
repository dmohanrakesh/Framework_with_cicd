package com.Framework_with_cicd.Utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	
	
	@DataProvider(name = "getExcelData")
	public static Object[][] getXlData(String xlfilepath, String sheetName) throws IOException {
		
		int rows = XLUtils.getRowCount(xlfilepath,  sheetName);
		int columns = XLUtils.getColumnCount(xlfilepath, sheetName);
		
		String data[][] = new String[rows-1][columns];
		
		for(int i = 1; i<=rows; i++ ) {
			for(int j=0; j<=columns; j++) {
				data[i-1][j]= XLUtils.getCellData(xlfilepath, sheetName,i,j);
			}
		}
		
		return data;
		
	}
	
	
	
}
