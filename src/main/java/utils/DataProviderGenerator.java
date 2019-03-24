package utils;

import java.util.HashMap;
import java.util.Map;

public class DataProviderGenerator 
{
	public static  Object[][] objectGeneratorFromSingleSheet(String xlName,String sheetName)
	{
		Object[][] data = null;
		int row=ExcelUtil.getRowCount("src/test/resources/gpApiServices/"+xlName+".xlsx",sheetName);
		int cell =ExcelUtil.getCellCount("src/test/resources/gpApiServices/"+xlName+".xlsx", sheetName,1);
		
		
		 data= new Object[row-1][1];
		
		for(int i=1;i<row;i++)
		{
			Map<String, String> datamap1  = new HashMap<String, String>();
			
			for(int j=0;j<cell;j++)
			{
	
					datamap1.put(ExcelUtil.getCellValue("src/test/resources/gpApiServices/"+xlName+".xlsx", sheetName, 0, j).toString(),ExcelUtil.getCellValue("src/test/resources/gpApiServices/"+xlName+".xlsx", sheetName,i, j).toString());	
			}
			data [i-1][0]= datamap1 ;
		}
		
		return data;
	}

	
	public static  Object[][] objectGeneratorFromMultiSheet(String xlName)
    {
                   
		String path="src/test/resources/gpApiServices/"+xlName+".xlsx";
		String sheetName1=ExcelUtil.getSheetName(path, 0);
		int row=ExcelUtil.getRowCount(path,sheetName1);
		int numberofSheets= ExcelUtil.getNumberOfSheets(path);
		      
		
		Object[][]  data= new Object[row-1][1];
                                                                                             
                                                                                                                    
		for(int i=1;i<row;i++)
		{
			Map<Object, Object> datamap = new HashMap<Object, Object>();  
			for(int j=0;j<numberofSheets;j++)
			{	
				String sheetName=ExcelUtil.getSheetName(path, j);
				int cell =ExcelUtil.getCellCount(path, sheetName, i);
                            
				for(int k=0;k<cell;k++)
				{
					 
					datamap.put(ExcelUtil.getCellValue(path, sheetName, 0, k), ExcelUtil.getCellValue(path, sheetName, i, k));
				}
                            			
			}

			data[i-1][0] = datamap;
		}
                    
		return data;
    }
}
