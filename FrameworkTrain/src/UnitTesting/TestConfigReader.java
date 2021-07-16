package UnitTesting;

import org.testng.annotations.Test;

import DataProvider.ReadConfig;

public class TestConfigReader
{
	@Test
	public void testconfig ()
	{
		ReadConfig ReadConfigfile = new ReadConfig();
		String IE_Path = ReadConfigfile.getChromePath();
				System.out.println("IE Driver is  located at " +IE_Path);
		
	}
	@Test
	public void testconfig1 ()
	{
		ReadConfig ReadConfigfile = new ReadConfig();
		String Chrome_Path = ReadConfigfile.getChromePath();
				System.out.println("Chrome Driver is  located at " +Chrome_Path);
		
	}
	
}
