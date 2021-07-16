package factory;

import DataProvider.ReadConfig;
import DataProvider.ReadExcelData;

public class DataProviderFactory {
	static ReadConfig config;
	static ReadExcelData  ExcelConfig;
		
	
	public static ReadConfig getconfig()
	{
		if (config==null) {
			config =new ReadConfig();
			 
		}
		return config;
		
	}

	public static ReadExcelData getExcelconfig()
	{
		if(ExcelConfig==null) {
			ExcelConfig=new ReadExcelData();
		
		}
		return ExcelConfig;
	}
	
	
}
