package com.Testutil;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtil {
	public static String[][] getDataFromExcel (String Sheet1 )
	{
		String [][] data=null;
		 XSSFWorkbook myworkbook = null;
		 try{
			 FileInputStream fileInput = new FileInputStream(new File("C:\\Users\\siva\\Desktop\\Venkat\\com.Selenium\\src\\com\\ExcelSheets\\Register.xlsx"));
			 
			 myworkbook = new XSSFWorkbook(fileInput);
			 XSSFSheet sheet = myworkbook.getSheet(Sheet1);
			 
			 int firstRow = sheet.getFirstRowNum()+1;
			 int lastRow = sheet.getLastRowNum();
			 int lastCol = sheet.getRow(0).getLastCellNum();
			 
			 
			 data = new String [lastRow][lastCol];
			 
			 for (int i= firstRow-1; i <lastRow; i++)
			 {
				 Row row =sheet.getRow(i+1);
				 for (int j=row.getFirstCellNum(); j<lastCol;j++)
				 {
					 try{
						 if(row.getCell(j).getCellType() == CellType.NUMERIC)
						 {
							 data[i][j]= String.valueOf((int)row.getCell(j).getNumericCellValue());
									 
						 }else if (row.getCell(j).getCellType() == CellType.STRING)
						 {
							 data[i][j]= row.getCell(j).getStringCellValue();
							 
						 }}
						 
						 catch(Exception e)
								 {
							 data[i][j]= "";
								 }
					 }
				 }
			 }
		 catch(Exception e)
		 {
			 System.out.println(e.getMessage());
			 
			 
			 
			 
			 
			 
			 
			 
		 }
		return data;
	}

}
