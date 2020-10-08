package com.qa.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtility {
	
	public static String TESTDATA_SHEET_PATH= "C://Users//siva//Desktop//Venkat//com.demo.automation//src//main//java//com//qa//Testdata//RegisterForm.xlsx";
	 static XSSFWorkbook workbook;
	
	public static Object[][] getTestdata(String Sheet1) throws IOException{
		
		 FileInputStream file=null;
		 try{
	
	  file = new FileInputStream(TESTDATA_SHEET_PATH);
	  
		 }catch (FileNotFoundException e)
		 {
			 e.printStackTrace();
		 }
	  
	  try{
		  workbook= new XSSFWorkbook(file);
			 
	  } catch (IOException e)
	  {
		  e.printStackTrace();
	  }
	  
	  
	  
	  
	  XSSFSheet sheet = workbook.getSheetAt(0);
		 
		int rowcount= sheet.getLastRowNum();
		int cellcount = sheet.getRow(0).getLastCellNum();
		 
		
		Object[][] data = new Object[rowcount][cellcount];
		
		
		
		for(int i=0;i<rowcount;i++)
		{
			Row row = sheet.getRow(i+1);
			for (int j=0;j<cellcount;j++)
				
			{
								
				 try{
					 if(row.getCell(j).getCellType() == CellType.NUMERIC)
					 {
						 data[i][j]= String.valueOf((long)row.getCell(j).getNumericCellValue());
						 System.out.println(data[i][j]);
								 
					 }else if (row.getCell(j).getCellType() == CellType.STRING)
					 {
						 data[i][j]= row.getCell(j).getStringCellValue();
						 System.out.println(data[i][j]);
						 
					 }
				 }catch(Exception e)
				 {
			 data[i][j]= "";
				 }
				   
				}
			
			
			
			
			FileOutputStream file1 = new FileOutputStream("C://Users//siva//Desktop//Venkat//com.Selenium//src//com//ExcelSheets//Register.xlsx");
		    workbook.write(file1);
			
		}
		
		
        
				 
		return data;
}

}
