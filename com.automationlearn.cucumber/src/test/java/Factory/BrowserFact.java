package Factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import dataProvider.ConfiguDataProvider;

public class BrowserFact {
	static WebDriver driver ;
	
public static WebDriver getBrowser(String browserName)
{
	if (browserName.equalsIgnoreCase("Chrome"))
	{
		ConfiguDataProvider config = new ConfiguDataProvider();
		System.setProperty("webdriver.chrome.driver", config.getChromePath());
		driver =new  ChromeDriver();
		
	}
	if(browserName.equalsIgnoreCase("firefox"))
	{
	 
		  ConfiguDataProvider config = new ConfiguDataProvider();
		  System.setProperty("webdriver.gecko.driver", config.getFirefoxPath());
		  driver = new FirefoxDriver();
		 
		
	}
	if (browserName.equalsIgnoreCase("IE")) {
		ConfiguDataProvider config = new ConfiguDataProvider();
		System.setProperty("webdriver.edge.driver", config.getIEPath());
		//driver =new InternetExplorerDriver();
		driver = new EdgeDriver();
	}
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 
	return driver;
	
}
public static void closebrowser(WebDriver ldriver)
{
	ldriver.quit();
}


}
