package unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import Factory.Gdataprovider;
 
 

public class DataProviderFactoryTest {
	
	@Test
	
	public void testconfig() {
		String Chrome_Loc= Gdataprovider.getconfig().getChromePath();
	 Assert.assertEquals( Chrome_Loc,"D:\\Standalone_jar\\chromedriver_win32\\\\chromedriver.exe");
	
		
	}

}
