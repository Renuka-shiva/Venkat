package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleData {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C://Users//siva//Desktop//Venkat//com.Selenium//src//com//ExcelSheets//Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet2");
		
		
	int rowCount	=sheet.getLastRowNum();
	
	for(int i =0;i<=rowCount;i++)
	{
		 Row row = sheet.getRow(i);
		 
		 int cellCount = row.getLastCellNum();
		 
		 for (int j=0;j<cellCount;j++)
		 {
			 Cell cell = row.getCell(j);
			 System.out.print("   " + cell.toString()); //toString();--------generic method for all data type
		 }
		 System.out.println();
	}
	 
	
		
	}

}
