package utils;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class ExcelUtil {

	public static String getCellValue (String path,String sheetName,int rowNum, int cellNum) 
	{
		Workbook workbook = null;
		Sheet sheet=null;
		String value = null;				

		try
		{
			File file = new File(path);
			 workbook=WorkbookFactory.create(file);
			
		}
		catch (Exception e)
		{
			Reporter.log("Excel sheet file not found at given path",true);
		}
		try
		{
			 sheet= workbook.getSheet(sheetName);
		}
		catch(Exception e)
		{
			Reporter.log("Given sheet not found or sheet name is incorrect",true);
		}
	
			Row row= sheet.getRow(rowNum);
			Cell cell=row.getCell(cellNum);
			 
		try
		{
			value =cell.getStringCellValue();
		}
		catch(Exception e)
		{
			try
			{
				value = String.valueOf((int)cell.getNumericCellValue());
			}
			

			catch(Exception e1)
			{
				value = "";
			}
		}	
		return value;
	}
	

	public static String getNumericCellValue (String path,String sheetName,int rowNum, int cellNum) 
	{
		Workbook workbook = null;
		Sheet sheet=null;
		String value=null;
		try
		{
			File f = new File(path);
			 workbook=WorkbookFactory.create(f);
			
		}
		catch (Exception e)
		{
			Reporter.log("Excel file not found at given path/ Excel file is open",true);
		}
		try
		{
			 sheet= workbook.getSheet(sheetName);
		}
		catch(Exception e)
		{
			Reporter.log("Given sheet not found or sheet name is incorrect",true);
		}
		
		
			Row row= sheet.getRow(rowNum);
			 Cell cell = row.getCell(cellNum);
			 
		try
		{
			value=String.valueOf((int)cell.getNumericCellValue());
			
		}
		catch(Exception e)
		{
			Reporter.log("No record found at given cell",true);
			value = "";
		}

		return value;

	}
	
	public static int getRowCount (String path,String sheetName) 
	{
		Workbook wb = null;
		Sheet s=null;
		try
		{
			File f = new File(path);
			 wb=WorkbookFactory.create(f);
			
		}
		catch (Exception e)
		{
			Reporter.log("Excel file not found at given path",true);
		}
		try
		{
			 s= wb.getSheet(sheetName);
		}
		catch(Exception e)
		{
			Reporter.log("Given sheet not found or sheet name is incorrect",true);
		}
		
		
		int value1=s.getPhysicalNumberOfRows();
			
		return value1;
	}
	
	public static int getCellCount (String path,String sheetName,int rownumber) 
	{
		Workbook workbook = null;
		Sheet sheet=null;
		try
		{
			File file = new File(path);
			 workbook=WorkbookFactory.create(file);
			
		}
		catch (Exception e)
		{
			Reporter.log("Excel file not found at given path",true);
		}
		try
		{
			 sheet= workbook.getSheet(sheetName);
		}
		catch(Exception e)
		{
			Reporter.log("Given sheet not found or sheet name is incorrect",true);
		}
		
		
		Row row = sheet.getRow(rownumber);
		int cellCount = row.getLastCellNum();
		System.out.println(row.getLastCellNum());
		System.out.println();
		
			
		return cellCount;
	}
	
	public static int getNumberOfSheets (String path) 
	{
		Workbook workbook = null;
		int s = 0;
		try
		{
			File f = new File(path);
			 workbook=WorkbookFactory.create(f);
			
		}
		catch (Exception e)
		{
			Reporter.log("Excel file not found at given path",true);
		}
		try
		{
			 s= workbook.getNumberOfSheets();
		}
		catch(Exception e)
		{
			Reporter.log("No sheet found or Excel is open",true);
		}
			
		return s;
	}
	
	
	
	public static String getSheetName (String path,int i) 
	{
		Workbook workbook = null;
		String s=null;
		try
		{
			File file = new File(path);
			 workbook=WorkbookFactory.create(file);
			
		}
		catch (Exception e)
		{
			Reporter.log("Excel file not found at given path",true);
		}
		try
		{
			 s= workbook.getSheetName(i);
		}
		catch(Exception e)
		{
			Reporter.log("Given sheet not found or sheet name is incorrect",true);
		}
			
		return s;
	}
	

}
