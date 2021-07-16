package UnitTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import factory.DataProviderFactory;

public class DataProviderFactoryTest {
	
	@Test
	
	public void testconfig() {
		String ie_path= DataProviderFactory.getconfig().getIEPath();
	Assert.assertEquals( ie_path,"C:\\Selenium_driver\\IEDriverServer.exe");
	
		
	}

}
