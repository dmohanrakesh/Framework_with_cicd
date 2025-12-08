package com.Framework_with_cicd.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils {

	public static File f;
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet wSheet;
//	public static XSSFRow row;
//	public static XSSFCell cell;
	
	public static int getRowCount(String filepath, String sheetName) throws IOException {
		
		//f = new File(filepath);
		
		
			try {
				fis = new FileInputStream(filepath);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			wb = new XSSFWorkbook(fis);
			wSheet = wb.getSheet(sheetName);
			int rowCount = wSheet.getLastRowNum();
			wb.close();
			fis.close();
		
		
		
		return rowCount;
	}
	
	public static int getColumnCount(String filepath, String sheetName) throws IOException{
		
		//f = new File(filepath);
		
		try {
			fis = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		wb = new XSSFWorkbook(fis);
		
		wSheet = wb.getSheet(sheetName);
		
		int rowNum = wSheet.getFirstRowNum();
		XSSFRow row = wSheet.getRow(rowNum);
		int columnCount = row.getLastCellNum();
		wb.close();
		fis.close();
		return columnCount;
	}
	
	public static String getCellData(String filepath, String sheetName, int i, int j) throws IOException{
		
		//f = new File(filepath);
		
		try {
			fis = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		wb = new XSSFWorkbook(fis);
		
		wSheet = wb.getSheet(sheetName);
		
//		int rowNum = wSheet.getFirstRowNum();
//		row = wSheet.getRow(rowNum);
//		int columnCount = row.getLastCellNum();
		
		XSSFRow row = wSheet.getRow(i);
		XSSFCell cell = row.getCell(j);
//		CellAddress cell = new CellAddress(i,j);
//		DataFormatter f = new DataFormatter();
//		String cellData = f.formatCellValue(cell);
		String cellData = cell.getStringCellValue();
		wb.close();
		fis.close();
		
		return cellData;
	}

	
}
