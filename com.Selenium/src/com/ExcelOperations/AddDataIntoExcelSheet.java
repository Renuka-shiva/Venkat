package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AddDataIntoExcelSheet {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C://Users//siva//Desktop//Venkat//com.Selenium//src//com//ExcelSheets//Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet3");
		
		
		Row row=sheet.createRow(0);
		Cell cell= row.createCell(0);
		
		cell.setCellValue("I Love You Bava");
		
		
		
		FileOutputStream file1 = new FileOutputStream("C://Users//siva//Desktop//Venkat//com.Selenium//src//com//ExcelSheets//Book1.xlsx");
		workbook.write(file1);
	}

}
