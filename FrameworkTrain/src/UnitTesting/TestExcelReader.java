package UnitTesting;

import org.testng.annotations.Test;

import DataProvider.ReadExcelData;

public class TestExcelReader {
	
	@ Test
	
	public void TestExcelData()
	{
	
	ReadExcelData RXLfile = new ReadExcelData() ;
	
	String data = RXLfile.getstringdata(1, 0);
	
	System.out.println("FirstName :"+data);
	
    double Phone = RXLfile.getnumericdata(1, 2);
	System.out.println("Phone :"+Phone);
	}
	
}

