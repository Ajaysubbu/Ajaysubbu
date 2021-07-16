package unittesting;

import org.testng.annotations.Test;

import dataProvider.ConfiguDataProvider;

 

public class TestCucuConfiguration {
	@Test
	public void testconfig1 ()
	{
		ConfiguDataProvider ReadConfigfile = new ConfiguDataProvider();
		String Chrome_Path = ReadConfigfile.getChromePath();
				System.out.println("Chrome Driver is  located at " +Chrome_Path);
		
	}
	@Test
	public void testconfig2 ()
	{
		ConfiguDataProvider ReadConfigfile = new ConfiguDataProvider();
		String Firefox_Path = ReadConfigfile.getFirefoxPath();
				System.out.println("Chrome Driver is  located at " +Firefox_Path);
		
	}
	@Test
	public void testconfig3 ()
	{
		ConfiguDataProvider ReadConfigfile = new ConfiguDataProvider();
		String IE_Path = ReadConfigfile.getIEPath();
				System.out.println("Chrome Driver is  located at " +IE_Path);
		
	}

}
